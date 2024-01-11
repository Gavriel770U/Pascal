import javax.swing.*;

public class PascalFrame extends JFrame 
{
    public PascalFrame()
    {
        setTitle("Gavriel's Pascal Triangles GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Settings.WIDTH.ivalue, Settings.HEIGHT.ivalue);
        setVisible(true);
        add(new PascalPanel());
        setLayout(null);
        setResizable(false);
    }
}
