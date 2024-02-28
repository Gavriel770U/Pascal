import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PascalPanel extends JPanel
{
    private final static int ZERO = 0; 
    private final static int DEC = 1;

    private SharedResource<Integer> modResource;
    private int mod;
    private HashMap<Long, Color> colorsMap;

    public PascalPanel(SharedResource<Integer> modResource)
    {
        this.modResource = modResource;
        setPreferredSize(new Dimension(Settings.GRAPHICS_WIDTH.ivalue, Settings.GRAPHICS_HEIGHT.ivalue));
        setDoubleBuffered(true);
        setBackground(Color.BLACK);
        setFocusable(true);
        requestFocusInWindow();

        this.mod = Settings.MOD_SLIDER_INIT_MOD.ivalue;
        this.modResource.setValue(this.mod);
        this.colorsMap = new HashMap<Long, Color>(Settings.MOD_SLIDER_MAX_MOD.ivalue - Settings.MOD_SLIDER_MIN_MOD.ivalue);
        this.initColorsMap();
    }

    public void setMod(int mod)
    {
        this.mod = mod;
    }

    @Override
    protected void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        this.mod = this.modResource.getValue();

        int normalizedHeight = Settings.GRAPHICS_HEIGHT.ivalue / Settings.PIXEL_SIZE.ivalue;

        long[] pascalArr = PascalFunctions.getPascalArray(normalizedHeight);
        // PascalFunctions.printPascalArray(pascalArr);
        
        PascalFunctions.modPascalArray(pascalArr, this.mod);
        int i = 0;
        int progress = 0;
        int level = 1;
        int x = Settings.GRAPHICS_WIDTH.ivalue / 2 - Settings.PIXEL_SIZE.ivalue;
        int y = 0;

        for (i = 0; i < pascalArr.length; i++)
        {
            graphics.setColor(this.colorsMap.get(pascalArr[i]));

            graphics.fillRect(x, y, Settings.PIXEL_SIZE.ivalue, Settings.PIXEL_SIZE.ivalue);
            x += Settings.PIXEL_SIZE.ivalue;

            progress++;
            if(ZERO == progress % level)
            {
                level++;
                progress = 0;
                y += Settings.PIXEL_SIZE.ivalue;
                x = (Settings.GRAPHICS_WIDTH.ivalue / 2) - (Settings.PIXEL_SIZE.ivalue * (level / 2 + 1));
            }
        }

        repaint();
    }

    private void initColorsMap()
    {
        Random rand = new Random();
        Long i = (long) Settings.MOD_SLIDER_MIN_MOD.ivalue - DEC;

        for(; i < Settings.MOD_SLIDER_MAX_MOD.ivalue; i++)
        {
            Color color;
            do
            {
                color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            } while(this.colorsMap.containsValue(color));

            this.colorsMap.put(i, color);
        }
    }
}