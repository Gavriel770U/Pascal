import javax.swing.*;
import java.awt.Color;

public class PascalPanel extends JPanel
{
    public PascalPanel()
    {
        this.setSize(Settings.WIDTH.ivalue, Settings.HEIGHT.ivalue);
        this.setDoubleBuffered(true);
        this.setBackground(Color.BLACK);
    }
}