import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Morning extends JFrame
{
  private EasySound rooster;
  private int time;
  /**
   *   Constructor
   */
  public Morning()
  {
    super("Morning");

    rooster = new EasySound("roost.wav");
    rooster.play();
    
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
