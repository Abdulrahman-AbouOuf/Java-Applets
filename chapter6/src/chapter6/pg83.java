package chapter6;
import java.awt.*;
import javax.swing.JOptionPane;
import java.applet.*;

public class pg83 extends Applet {
	int x=0, i=0;
	public void init() {
		this.resize(800, 900);
	}
	
	public void paint(Graphics g) {
		int w = this.getWidth();
		this.setBackground(Color.cyan);
		g.setColor(Color.DARK_GRAY);
		int [] xpoints = {150+x, 250+x, 250+x, 260+x, 260+x, 300+x, 300+x, 290+x,290+x, 260+x, 260+x, 250+x, 250+x, 170+x, 170+x, 150+x};
		int [] ypoints = {40,40,20,20,40,40,150,150,130,130,150,150,80,80,150,150};
		g.fillPolygon(xpoints, ypoints, 16); //first car		
		g.fillRect(x, 40, 140, 90); //Second Car
		g.setColor(Color.black);
		g.fillOval(260+x, 130, 30, 30);
		g.fillOval(170+x, 80, 80, 80); //big wheel
		g.fillOval(10+x, 130, 30, 30);
		g.fillOval(90+x, 130, 30, 30);
		
		g.setColor(Color.white);
		for(int j=0; j<=360; j+=90) {
			g.fillArc(170+x, 80, 80, 80, j-i, 20);
			g.fillArc(10+x, 130, 30, 30, j-i, 20);
			g.fillArc(90+x, 130, 30, 30, j-i, 20);
			g.fillArc(260+x, 130, 30, 30, j-i, 20);
		}
		
		g.setColor(Color.GRAY);
		g.fillRect(10+x, 50, 20, 20);
		g.fillRect(60+x, 50, 20, 20);
		g.fillRect(110+x, 50, 20, 20);
		g.fillRect(270+x, 50, 20, 20);
		
		g.fillRect(140+x, 50, 10, 10);
		g.fillRect(140+x, 110, 10, 10);
		
		g.setColor(Color.yellow);
		g.fillArc(290+x, 50, 20, 20, 270, 180);
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 160, w, 100);
		
		x++;
		if(x==w) x=0;
		i++;
		if(i==360) i=0;
		try {
		Thread.currentThread().sleep(10);
		}
		catch(Exception ex) {}	
		
		repaint(1);
		
	}

}
