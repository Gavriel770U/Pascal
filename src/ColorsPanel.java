import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ColorsPanel extends JPanel implements ActionListener, ItemListener
{
    private JComboBox<String> modComboBox;

    public ColorsPanel()
    {   
        setPreferredSize(new Dimension(Settings.SETTINGS_WIDTH.ivalue, Settings.SETTINGS_HEIGHT.ivalue));
        setDoubleBuffered(true);
        setBackground(Color.BLACK);
        setFocusable(true);
        setLayout(getLayout());
        requestFocusInWindow();

        JButton button = new JButton("Pad Color");
        button.setPreferredSize(new Dimension(100, 30));
        button.addActionListener(this);

        int modValuesAmount = Settings.MOD_SLIDER_MAX_MOD.ivalue - Settings.MOD_SLIDER_MIN_MOD.ivalue + 1;
        String[] modValuesStrings = new String[modValuesAmount];

        for (int i = 0; i < modValuesAmount; i++)
        {
            modValuesStrings[i] = Integer.toString(i + Settings.MOD_SLIDER_MIN_MOD.ivalue);
        }
         
        modComboBox = new JComboBox<>(modValuesStrings);
        modComboBox.setSelectedIndex(Settings.MOD_SLIDER_INIT_MOD.ivalue);
        modComboBox.addItemListener(this);
        modComboBox.setEditable(false);
        modComboBox.setPreferredSize(new Dimension(50, 20));

        add(modComboBox);       
        add(new JLabel("MOD VALUE | RGB VALUES"));
        add(button);
        add(new JLabel("TODO: Add Horizontal slider for RGB values choosing and viewing"));
    }

    public void actionPerformed(ActionEvent e)
    {  
        Color c = JColorChooser.showDialog(this,"Choose",Color.CYAN);  
        System.out.println(c);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == this.modComboBox)
        {
            System.out.println(this.modComboBox.getSelectedItem());
        }
    }
}
