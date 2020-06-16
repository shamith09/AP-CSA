import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class ShapeComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(Color.LIGHT_GRAY);
      
      Color colorScr1 = new Color(46, 65, 111); //200, 150, 180
      Color colorBlankOut = new Color(255, 255, 255, 150); // to blank out
      
      Rectangle box1 = new Rectangle(76, 56, 50, 150);
      Ellipse2D.Double oval1 = new Ellipse2D.Double(47, 9, 65, 76);
      
      Line2D.Double aLine = new Line2D.Double(0, 200, 200, 165);

      int[] xCoords = {89, 76, 65, 54};
      int[] yCoords = {56, 145, 213,123};
      Polygon aPoly = new Polygon(xCoords, yCoords, 4);
      
      g2.setColor(Color.blue);
      g2.draw(box1);
      
      box1.grow(-30, -20); 
      g2.setColor(colorScr1); 
      g2.fill(box1);

      box1.grow(20, 15);
      g2.setColor(colorBlankOut); 
      g2.fill(box1);
      
      Color colorScr2 = new Color(65, 155, 254);
      g2.setColor(colorScr2);    
      g2.fill(oval1);
      
      g2.setStroke(new BasicStroke(5));
      g2.setColor(Color.GREEN);    
      g2.draw(aLine);
      
      g2.setColor(Color.MAGENTA);     
      g2.draw(aPoly);
      g2.setColor(Color.RED);     
      g2.fill(aPoly);
      aPoly.translate(1,1);
      
      Font txtFont = new Font("Serif", Font.BOLD,20);
      g2.setFont(txtFont);
      g2.setColor(Color.RED);
      g2.drawString("Abstract Art (Picasso)", 5, 237);
      
      Rectangle box2 = new Rectangle(0, 0, 200, 250);
      g2.draw(box2);
      g2.setColor(colorBlankOut); 
      g2.fill(box1);
      
      Ellipse2D.Double oval2 = new Ellipse2D.Double(300, 200, 50, 50);
      g2.setColor(Color.BLACK);
      g2.draw(oval2);
      
      Line2D.Double aLine2 = new Line2D.Double(325, 250, 325, 340);
      g2.draw(aLine2);
      Line2D.Double aLine3 = new Line2D.Double(325, 340, 290, 385);
      g2.draw(aLine3);
      Line2D.Double aLine4 = new Line2D.Double(325, 340, 360, 385);
      g2.draw(aLine4);
      Line2D.Double aLine5 = new Line2D.Double(325, 295, 285, 300);
      g2.draw(aLine5);
      Line2D.Double aLine6 = new Line2D.Double(325, 295, 365, 300);
      g2.draw(aLine6);
      
      Font txtFont2 = new Font("Serif", Font.BOLD,20);
      g2.setFont(txtFont);
      g2.setColor(Color.BLACK);
      g2.drawString("Woah very cool painting", 250, 175);
   }
}
