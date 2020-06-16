import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MorningSounds extends JFrame 
    implements ActionListener
{
  private EasySound rooster;
  private int time;
  /**
   *   Constructor
   */
  public MorningSounds()
  {
    super("Morning");
    
    rooster = new EasySound("roost.wav");
    rooster.play();
    
    Timer clock = new Timer(5000, this);
    clock.start();
    
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }
  public void actionPerformed(ActionEvent e)
  {
    rooster.play();
  }
  public static void main(String[] args)
  {
    MorningSounds morning = new MorningSounds();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
