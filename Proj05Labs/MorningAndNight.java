import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MorningAndNight extends JFrame 
    implements ActionListener
{
  private EasySound rooster;
  private EasySound cow;
  private int time;
  private boolean morning;
  /**
   *   Constructor
   */
  public MorningAndNight()
  {
    super("Morning");
    morning = true;
    rooster = new EasySound("roost.wav");
    //rooster.play();
    cow = new EasySound("moo.wav");
    //cow.play();
    Container c = getContentPane();
    if (morning)
    {
        rooster.play();
        c.setBackground(Color.WHITE);
    }
    else
    {
        cow.play();
        c.setBackground(Color.BLACK);
    }
    morning = !morning;
    
    Timer clock = new Timer(5000, this);
    clock.start();
    
  }
  public void actionPerformed(ActionEvent e)
  {
    Container c = getContentPane();
    if (morning)
    {
        rooster.play();
        c.setBackground(Color.WHITE);
    }
    else
    {
        cow.play();
        c.setBackground(Color.BLACK);
    }
    morning = !morning;
  }
  public static void main(String[] args)
  {
    MorningAndNight morning = new MorningAndNight();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
