import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class SettingsPanel extends JPanel
{
    public SettingsPanel()
    {
        setPreferredSize(new Dimension(Settings.SETTINGS_WIDTH.ivalue, Settings.SETTINGS_HEIGHT.ivalue));
        setDoubleBuffered(true);
        setBackground(Color.GRAY);
        setFocusable(true);
        requestFocusInWindow();
    }    
}
