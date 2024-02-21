import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;

public class ColorsPanel extends JPanel implements ActionListener
{
    public ColorsPanel()
    {   
        setPreferredSize(new Dimension(Settings.SETTINGS_WIDTH.ivalue, Settings.SETTINGS_HEIGHT.ivalue));
        setDoubleBuffered(true);
        setBackground(Color.BLACK);
        setFocusable(true);
        setLayout(new GridLayout(2, 2));
        requestFocusInWindow();

        JButton button = new JButton("Pad Color");
        button.setBounds(0, 0, 100, 30);
        button.addActionListener(this);
        
        add(new JLabel("TODO: Mod value to change its color JCombobox"));       
        add(new JLabel("MOD VALUE | RGB VALUES"));
        add(button);
        add(new JLabel("TODO: Add Horizontal slider for RGB values choosing and viewing"));
    }

    public void actionPerformed(ActionEvent e)
    {  
        Color c = JColorChooser.showDialog(this,"Choose",Color.CYAN);  
        System.out.println(c);
    }
}
