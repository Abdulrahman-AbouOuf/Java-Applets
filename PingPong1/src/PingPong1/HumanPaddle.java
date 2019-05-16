package PingPong1;

import java.awt.*;


public class HumanPaddle implements Paddle {
	double y,yVel;
	boolean upAccel,downAccel;
	int player,x; //x and y represent the place of the paddle and player spicefies wether it's player on or two
	final double GRAVITY = 0.94;
	
	public HumanPaddle(int player) { //the constructor is called to know which paddle of each player
		upAccel=false; downAccel=false;
		y = 210; yVel = 0;
		if(player==1) x=20;
		else x=660;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, (int)y, 20, 80);
		
		
	}

	@Override
	public void move() {
		if(upAccel) {
			yVel -=2; //for the paddle to go up
		}
		else if(downAccel) {
			yVel +=2; //for the paddle to go down
		}
		else if(!upAccel && !downAccel) {
			yVel*= GRAVITY; //For Accelration
		}
		
		
		if(yVel>=5) yVel = 5;
		else if(yVel <=-5) yVel = -5;
		
		y += yVel;
		if(y<=0) y=0;
		if(y>=420) y=420;
		
		
	}
	
	public void setUpAccel(boolean input) {
		upAccel = input;
	}
	
	public void setDownAccel(boolean input) {
		downAccel = input;
	}

	@Override
	public int getY() {
		return (int)y;
		
	}
	

}
