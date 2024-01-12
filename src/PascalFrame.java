import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

public class PascalFrame extends JFrame 
{
    public PascalFrame()
    {
        setTitle("Gavriel's Pascal Triangles GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(Settings.WIDTH.ivalue, Settings.HEIGHT.ivalue));
        setLayout(new BorderLayout());
        add(new PascalPanel());
        setResizable(false);
        pack();
        setVisible(true);
    }
}
