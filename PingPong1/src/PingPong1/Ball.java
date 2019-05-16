package PingPong1;

import java.awt.*;
import java.applet.AudioClip;

public class Ball {
	double xVel,yVel,x,y;
	
//	private static final long serialVersionUID = 2530894095587089544L;	     
//    private AudioClip clip;  
//    
//    public void init() {
//    	clip = getAudioClip();
//    }
	
	public Ball() {
		x=350;
		y=250;
		xVel = -3;
		yVel = 3;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.orange);		 
		g.fillOval((int)x-10,(int) y-10, 20, 20);	
		
	}
	
	public void checkPaddleCollision(Paddle p1, Paddle p2) {
		if(x<=50) { //the first player
			if(y >= p1.getY() && y<= p1.getY() + 80) { 
				xVel = -xVel; 
				//clip.play();
			}
		}			
		
		else if (x>= 650) { //the second player
			if(y >= p2.getY() && y<= p2.getY() + 80) {
				xVel = -xVel; 
				//clip.play();
			}
		}
		
	}
	
	public void move() {
		x+=xVel;
		y+=yVel;
		
		if(y<10) yVel = -yVel;
		if(y>490) yVel = -yVel;
		
	}
	
	public int getX() {
		return (int)x;
	}
	
	public int getY() {
		return (int)y;
	}

}
