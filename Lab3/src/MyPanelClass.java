import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        g.setColor(Color.GREEN);
//                        g.drawRect(x1+2, y1+2, width-4, height-4);
                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.CYAN);
//                        g.drawLine(x2, y1, x1, y2);
                       //Paint an oval
//                       g.setColor(Color.LIGHT_GRAY);
//                       g.fillOval(getWidth()/2-55/2, getHeight()/2-55/2, 55, 55);
                        //Blue triangle
                        Polygon p = new Polygon();
                        p.addPoint(x1, y1+1);
                       // p.addPoint(x1 + 20, y1 );
                        p.addPoint(x1 + 115, y1+100);
                        p.addPoint(x1 + 115, y1+100);
                        p.addPoint(x1, y1 + 185);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        //Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 90);
                        p2.addPoint(x1 + 41, y1 + 90);
                        p2.addPoint(x1 + 47, y1 + 75);
                        p2.addPoint(x1 + 53, y1 + 90);
                        p2.addPoint(x1 + 69, y1 + 90);
                        p2.addPoint(x1 + 56, y1 + 100);
                        p2.addPoint(x1 + 61, y1 + 115);
                        p2.addPoint(x1 + 47, y1 + 105);
                        p2.addPoint(x1 + 34, y1 + 115);
                        p2.addPoint(x1 + 38, y1 + 100);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        //First white stripe
                        Polygon p3= new Polygon();
                        p3.addPoint(x1 + 85, y1 + 75);
                        p3.addPoint(x1 + 45, y1 + 40);
                        p3.addPoint(x1 + 399, y1 + 40);
                        p3.addPoint(x1 + 399, y1 + 75);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p3);
                        //Second white stripe
                        Polygon p4= new Polygon();
                        p4.addPoint(x1 + 82, y1 + 125);
                        p4.addPoint(x1 + 32, y1 + 160);
                        p4.addPoint(x1 + 399, y1 + 160);
                        p4.addPoint(x1 + 399, y1 + 125);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p4);
                        
                        
            }
}
