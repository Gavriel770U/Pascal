import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class SettingsPanel extends JPanel
{
    public SettingsPanel()
    {
        setPreferredSize(new Dimension(Settings.SETTINGS_WIDTH.ivalue, Settings.SETTINGS_HEIGHT.ivalue));
        setDoubleBuffered(true);
        setBackground(Color.GRAY);
        setFocusable(true);
        setLayout(new GridLayout(1, 2));
        requestFocusInWindow();
        add(new ModSlider (Settings.MOD_SLIDER_WIDTH.ivalue,
                          Settings.MOD_SLIDER_HEIGHT.ivalue,
                          Settings.MOD_SLIDER_MIN_MOD.ivalue,
                          Settings.MOD_SLIDER_MAX_MOD.ivalue,
                          Settings.MOD_SLIDER_INIT_MOD.ivalue
            )
        );

        add(new JLabel("TODO: Add Color chooser For Each MOD Result"));

    }    
}
