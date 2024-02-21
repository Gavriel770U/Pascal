import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsPanel extends JPanel
{
    private ModSlider modSlider;
    private SharedResource<Integer> modResource;

    public SettingsPanel(SharedResource<Integer> mod)
    {
        this.modResource = mod;

        this.modSlider = new ModSlider (Settings.MOD_SLIDER_WIDTH.ivalue,
                                        Settings.MOD_SLIDER_HEIGHT.ivalue,
                                        Settings.MOD_SLIDER_MIN_MOD.ivalue,
                                        Settings.MOD_SLIDER_MAX_MOD.ivalue,
                                        Settings.MOD_SLIDER_INIT_MOD.ivalue,
                                        this.modResource
        );

        setPreferredSize(new Dimension(Settings.SETTINGS_WIDTH.ivalue, Settings.SETTINGS_HEIGHT.ivalue));
        setDoubleBuffered(true);
        setBackground(Color.GRAY);
        setFocusable(true);
        setLayout(new GridLayout(1, 2));
        requestFocusInWindow();
        add(this.modSlider);
        add(new ColorsPanel());
    }    

    public int getSliderMod()
    {
        return this.modSlider.getMod();
    }


}
