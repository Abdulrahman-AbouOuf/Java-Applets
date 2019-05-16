package chapter6;
import java.awt.*;
import javax.swing.JOptionPane;
import java.applet.*;

public class pg42 extends Applet {
	public void paint(Graphics g) {
		g.fillArc(100, 100, 80, 80, 0, 180); //hair
		g.drawOval(110, 110, 60, 60); //face
		g.setColor(Color.yellow);
		g.fillOval(110, 110, 60, 60); //fill the head yellow
		g.setColor(Color.black);
		g.drawOval(120, 120, 10, 20); //eye
		g.drawOval(150, 120, 10, 20); //eye
		g.fillOval(120, 130, 10, 10);
		g.fillOval(150, 130, 10, 10);
		g.fillOval(100, 140, 10, 10);
		g.fillOval(100, 150, 10, 10);
		g.fillOval(100, 160, 10, 10);
		g.fillOval(170, 140, 10, 10);
		g.fillOval(170, 150, 10, 10);
		g.fillOval(170, 160, 10, 10);
		g.fillArc(130, 150, 20, 20, 180, 0);
	}

}
