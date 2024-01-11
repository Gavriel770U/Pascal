import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class PascalPanel extends JPanel
{
    public PascalPanel()
    {
        setSize(Settings.WIDTH.ivalue, Settings.HEIGHT.ivalue);
        setDoubleBuffered(true);
        setBackground(Color.BLACK);
        setFocusable(true);
        requestFocusInWindow(); 
    }

    @Override
    protected void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        graphics.setColor(Color.CYAN);
        graphics.drawRect(100, 100, 50, 50);

        repaint();
    }

}