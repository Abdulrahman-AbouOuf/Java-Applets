package chapter6;
import java.awt.*;

import javax.swing.JOptionPane;

import java.applet.*;

public class chapter extends Applet {
	public int noside, roundangle;
	public void init() {
		noside = Integer.valueOf(JOptionPane.showInputDialog("enter number of sides"));
	}
	public void paint(Graphics g) {
		int r=200, c1=300, c2=300;
		roundangle = (360/noside)/2;
		for(int i=0; i<5; i++) {
			Grid(g,c1,c2,r,noside,0);
			Grid(g,c1,c2,r,noside,roundangle);
			
		}
	}
	
	public void Grid(Graphics g, int c1, int c2, int r, int noside, int roundangle) {
		int x1, x2=0, y1, y2=0;
		x1 = (int)(c1 + r*Math.cos(roundangle*3.14/180));
		y1 = (int)(c2 - r*Math.sin(roundangle*3.14/180));
		
		for(int i= roundangle; i<=360+roundangle; i+=(360/noside)) {
			x1 = (int)(c1 + r*Math.cos(i*3.14/180));
			y1 = (int)(c2 - r*Math.sin(i*3.14/180));
			g.drawLine(x1, y1, x2, y2);
			x2 = x1;
			y2 = y1;
			
		}
	}

}
