import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

public class PascalFrame extends JFrame 
{
    private SharedResource sharedMod;

    public PascalFrame()
    {
        setTitle("Gavriel's Pascal Triangles GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(Settings.FRAME_WIDTH.ivalue, Settings.FRAME_HEIGHT.ivalue));
        setLayout(new BorderLayout());
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            
        this.sharedMod = new SharedResource();

        JPanel graphicsPanel = new PascalPanel(sharedMod);
        JPanel settingsPanel = new SettingsPanel(sharedMod);

        mainPanel.add(graphicsPanel);
        mainPanel.add(settingsPanel);
        add(mainPanel);
        setResizable(false);
        pack();
        setVisible(true);
    }
}
