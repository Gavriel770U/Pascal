import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

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
        setLayout(new GridLayout(1, 1));
        requestFocusInWindow();
        add(this.modSlider);
    }    

    public int getSliderMod()
    {
        return this.modSlider.getMod();
    }


}
