import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class ModSlider extends JSlider implements ChangeListener
{
    private int mod;
    private JLabel modValueLabel;
    private SharedResource<Integer> modResource;

    public ModSlider(int width, int height, int minMod, int maxMod, int mod, SharedResource<Integer> modResource)
    {
        super(minMod, maxMod, mod);
        this.modResource = modResource;
        this.modValueLabel = new JLabel("", JLabel.CENTER);
        modValueLabel.setPreferredSize(new Dimension(width, 50));
        modValueLabel.setForeground(Color.WHITE);
        this.modValueLabel.setText("MOD = " + mod);
        setLayout(new FlowLayout());
        addChangeListener(this);
        add(this.modValueLabel);
        setPreferredSize(new Dimension(width, height));
        setDoubleBuffered(true);
        setBackground(Color.BLACK);
        setPaintTicks(true);
        setMinorTickSpacing(Settings.MOD_SLIDER_MINOR_TICKS_SPACING.ivalue);
        setPaintTrack(true);
        setMajorTickSpacing(Settings.MOD_SLIDER_MAJOR_TICKS_SPACING.ivalue);
        setPaintLabels(true);

        this.mod = mod;
        this.modResource.setValue(this.mod);
    }

    public int getMod()
    {
        return this.modResource.getValue();
    }

    @Override
    public void stateChanged(ChangeEvent event)
    {
        this.mod = this.getValue();
        this.modValueLabel.setText("MOD = " + this.mod);
        this.modResource.setValue(this.mod);
    }
}