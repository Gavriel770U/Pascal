import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class PascalPanel extends JPanel
{
    private final static int ZERO = 0; 
    private SharedResource modResource;
    private int mod;

    public PascalPanel(SharedResource modResource)
    {
        this.modResource = modResource;
        setPreferredSize(new Dimension(Settings.GRAPHICS_WIDTH.ivalue, Settings.GRAPHICS_HEIGHT.ivalue));
        setDoubleBuffered(true);
        setBackground(Color.BLACK);
        setFocusable(true);
        requestFocusInWindow();

        this.mod = 2;
        this.modResource.setValue(this.mod);
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
            if (1 == pascalArr[i])
            {
                graphics.setColor(Color.MAGENTA);
            }
            else
            {
                graphics.setColor(Color.BLUE);  
            }

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
}