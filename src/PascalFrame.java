import javax.swing.*;

public class PascalFrame extends JFrame 
{
    public PascalFrame()
    {
        this.setSize(Settings.WIDTH.ivalue, Settings.HEIGHT.ivalue);
        this.setVisible(true);
        this.setLayout(getLayout());
        
    }    
}
