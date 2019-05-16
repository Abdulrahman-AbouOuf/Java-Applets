package chapter6;
import java.awt.*;
import javax.swing.JOptionPane;
import java.applet.*;

public class pg93 extends Applet {
	public void init() {
		this.resize(800, 900);
	}
	
	int x=0, i=0, j=0, motion = 0; //for the player
	int m=0,n=0; //for the ball
	public void paint (Graphics g) {
		this.setBackground(Color.green);
		g.setColor(Color.white);
		g.fillOval(210+m, 320, 60, 60);
		g.setColor(Color.gray);
		for(int l=0; l<=360; l+=90) {
			g.fillArc(210+m, 320, 60, 60, l+n, 30);
		}
		
		g.setColor(Color.yellow);
		g.fillOval(10+x, 100, 40, 40);
		
		int [] x_bhand = {20+x, 40+x, 40+x-j, 80+x-j, 80+x-j, 40+x-j, 20+x-j};
		int [] y_bhand = {160,160,190,190,210,210,190};
		g.fillPolygon(x_bhand, y_bhand, 7);
		
		g.setColor(Color.red);
		int [] x_body = {x,20+x,20+x,40+x,40+x,60+x,60+x,x};
		int [] y_body = {160,140,130,130,140,150,250,250};		
		g.fillPolygon(x_body,y_body, 8);
		
		g.setColor(Color.yellow);
		g.fillOval(10+x, 100, 40, 40);
		int [] x_fhand = {20+x, 40+x, 40+x+j, 80+x+j, 80+x+j, 40+x+j, 20+x+j};
		int [] y_fhand = {160,160,190,190,210,210,190};
		g.fillPolygon(x_fhand, y_fhand, 7);
		
		g.setColor(Color.black);
		int [] x_bleg = {x, 60+x, 60+x-j, 80+x-j, 80+x-j, 40+x-j};
		int [] y_bleg = {250,250,360,360,380,380};
		g.fillPolygon(x_bleg, y_bleg,6);
		
		int [] x_fleg = {x, 60+x, 60+x+j, 80+x+j, 80+x+j, 40+x+j};
		int [] y_fleg = {250,250,360,360,380,380};
		g.fillPolygon(x_fleg, y_fleg,6);
		
		
		if(motion==0) {
			if(i==0) {
				i++;
				if(j==20) i=1;
			}
			if(i==1) {
				j--;
				if(j==-20){i=0;
			}
				x++;
				if(x==70) motion =1;				
		}
	}
		if(motion==1) {
			m++;
			n++;
			if(n==360) n=0;
			if(m==this.getWidth()) m=0;
		}
		try {
			Thread.currentThread().sleep(10);
			}
			catch(Exception ex) {}	
			
			repaint(1);

}
}

