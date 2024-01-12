import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.Dimension;

public class ModSlider extends JSlider implements ChangeListener
{

    private int mod;
    private int minMod;
    private int maxMod;

    public ModSlider(int width, int height, int minMod, int maxMod, int mod)
    {
        super(minMod, maxMod, mod);
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.BLACK);
        setPaintTicks(true);
        setMinorTickSpacing(Settings.MOD_SLIDER_MINOR_TICKS_SPACING.ivalue);
        setPaintTrack(true);
        setMajorTickSpacing(Settings.MOD_SLIDER_MAJOR_TICKS_SPACING.ivalue);

        this.minMod = minMod;
        this.maxMod = maxMod;
        this.mod = mod;
    }

    @Override
    public void stateChanged(ChangeEvent event)
    {

    }
}