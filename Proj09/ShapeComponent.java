import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;
import java.util.Random;

@SuppressWarnings("unused")
public class ShapeComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      // Variables
      final int WIDTH = 800;
      final int HEIGHT = 600;
      final int HORIZONLOCATION = HEIGHT * 17/24;
      final int textShadowOffset = 3;
      final int treeHeight = 275;
      final int baseLength = 260;
      final int topLength = 10;
      final int numBranches = 25;
      final int lengthDepreciation = (baseLength - topLength) / numBranches;
      final int heightDepreciation = treeHeight / numBranches;
      final int lightRadius = 10;
      
      // Colors
      Color black = new Color(0, 0, 0);
      Color woodBrown = new Color(66, 47, 32);
      Color snow = new Color(255, 250, 250);
      Color darkRed = new Color(88, 0, 0);
      Color lightColor = new Color(255, 255, 0);

      // Border
      Rectangle border = new Rectangle(0, 0, WIDTH, HEIGHT); // minimum 480 x 600
      g2.setColor (black); 
      g2.draw(border);
      
      // Background
      for (int i = 0; i < 100; i++)
      {
    	  Rectangle background = new Rectangle(0, (int)(4.3*i), WIDTH, 7);
    	  Color curColor = new Color((50/100)*i, (152/100)*i, 115+(100/100)*i);
    	  g2.setColor(curColor);
    	  g2.draw(background);
    	  g2.fill(background);
      }
      
      Rectangle land = new Rectangle(0, HORIZONLOCATION, WIDTH, HEIGHT);
      g2.setColor(snow);
	  g2.draw(land);
	  g2.fill(land);
      
      // Stars
      for (int i = 0; i < 35; i++)
      {
    	  Random rand = new Random();
    	  int midX = rand.nextInt(WIDTH) + 1;
	  int midY = rand.nextInt(HEIGHT * 11/24) + 1;
	  int a = rand.nextInt(2)+2;
	  int b = rand.nextInt(2)+10;
	  int c = rand.nextInt(2)+4;
	  int radius[] = {b,a,9,c};
	  int nPoints = 16;
	  int[] X = new int[nPoints];
	  int[] Y = new int[nPoints];
	  
	  for (double current = 0.0; current < nPoints; current++)
	    {
	        int j = (int) current;
	        double x = Math.cos(current*((2*Math.PI)/10))*radius[j % 4];
	        double y = Math.sin(current*((2*Math.PI)/10))*radius[j % 4];

	        X[j] = (int) x+midX;
	        Y[j] = (int) y+midY;
	    }

	    g.setColor(Color.WHITE);
	    g.fillPolygon(X, Y, nPoints);
      } 
      
      // Tree
      Rectangle treeBody = new Rectangle(175, 400, 8, treeHeight);
      g2.setColor(woodBrown);
      g2.draw(treeBody);
      g2.fill(treeBody);
      Rectangle treeBody2 = new Rectangle(175, 400 + treeHeight, 8, 10);
      g2.draw(treeBody2);
      g2.fill(treeBody2);
      
      for (int i = 0; i < numBranches; i++)
      {
    	  Line2D.Double branch = new Line2D.Double(309 - lengthDepreciation*i/2,
    			  								   675 - heightDepreciation*i, 
    			  								   49 + lengthDepreciation*i/2, 
    			  								   675 - heightDepreciation*i);
    	  g2.draw(branch);
          g2.fill(branch);
      }
      
      int temp = baseLength;
      g2.setColor(lightColor);
      for (int i = 0; i < numBranches + 1; i++)
      {
    	  for (int j = 0; j < temp / lightRadius + i; j++)
    	  {
    		  Ellipse2D.Double light = new Ellipse2D.Double(49 + lightRadius*j + lengthDepreciation*i/2, 
    				  							675 - lightRadius/2 - heightDepreciation*i, 
			  									lightRadius, 
			  									lightRadius);
        	  g2.draw(light);
        	  g2.fill(light);
    	  }
    	  temp -= 2*lengthDepreciation;
      }
      
      // Words
      Font txtFont = new Font("Arial", Font.BOLD | Font.ITALIC, 50);
      g2.setFont(txtFont);
 
      g2.setColor(darkRed);
      g2.drawString("Happy", 475 + textShadowOffset, 675 + textShadowOffset);
      g2.drawString("Holidays!", 525 + textShadowOffset, 735 + textShadowOffset);
      
      g2.setColor(Color.RED);
      g2.drawString("Happy", 475, 675);
      g2.drawString("Holidays!", 525, 735);
      
      // House
      Rectangle body = new Rectangle(450, 275, 250, 250);
      g2.setColor(woodBrown);
      g2.draw(body);
      g2.fill(body);
      
      Rectangle window1 = new Rectangle(475, 325, 60, 60);
      g2.setColor(lightColor);
      g2.draw(window1);
      g2.fill(window1);
      Rectangle window2 = window1;
      window2.translate(140, 0);
      g2.draw(window2);
      g2.fill(window2);
      
      g2.setColor(snow);
      int[] xCoords = {415, 735, 575};
      int[] yCoords = {275, 275, 100};
      Polygon body2 = new Polygon(xCoords, yCoords, 3);
      g2.draw(body2);
      g2.fill(body2);
      AffineTransform transformAmt = new AffineTransform();
      transformAmt.scale(.9, .9);
      transformAmt.translate(65, 57);
      //transformAmt.translate(65, 57);
      //transformAmt.scale(.999, .999);
      //transformAmt.translate(145, 99);
      g2.setColor(woodBrown);
      g2.setTransform(transformAmt);
      g2.draw(body2);
      g2.fill(body2);
      
   }
}
