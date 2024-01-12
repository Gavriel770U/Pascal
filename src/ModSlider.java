import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ModSlider extends JSlider implements ChangeListener
{

    private int mod;
    private int minMod;
    private int maxMod;

    public ModSlider(int width, int height, int minMod, int maxMod, int mod)
    {
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.BLACK);
        this.minMod = minMod;
        this.maxMod = maxMod;
        this.mod = mod;
    }

    @Override
    public void stateChanged(ChangeEvent event)
    {

    }
}