import javax.swing.*;

public class PascalFrame extends JFrame 
{
    public PascalFrame()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Settings.WIDTH.ivalue, Settings.HEIGHT.ivalue);
        setVisible(true);
        add(new PascalPanel());
        setLayout(null);
        setResizable(false);
        setBounds(0, 0, Settings.WIDTH.ivalue, Settings.HEIGHT.ivalue);
    }
}
