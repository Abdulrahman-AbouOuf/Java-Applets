package Snake;

import java.util.List;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	List<Point> snakePoints; 
	int xDir, yDir;
	boolean isMoving; //to know if the snake is moving
	boolean elongate; //to know when to make taller each time it eats
	final int STARTSIZE = 20, STARTX = 150, STARTY = 150; //initial condition of the snake
	public Snake() {
		snakePoints = new ArrayList<Point>();
		xDir = 0;
		yDir = 0;
		isMoving = false;
		elongate = false;
		snakePoints.add(new Point(STARTX, STARTY));
		
		for(int i=1;i<STARTSIZE; i++) {
			snakePoints.add(new Point(STARTX-i*4, STARTY)); //add a point to the body of the snake to the left and as each point is assigned as 4 sizerect
			
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		for (Point p : snakePoints) {
			g.fillRect(p.getX(), p.getY(), 4, 4);
		}
	}
	
	public void move() {
		if (isMoving) { //boolean as in first the snake is paused but when the player hits a key this will be true
			Point temphead = snakePoints.get(0);
			Point temptail = snakePoints.get(snakePoints.size()-1);
			Point newStart = new Point(temphead.getX() + xDir*4 , temphead.getY() + yDir*4);
			
			for(int i = snakePoints.size() - 1; i>=1; i--) {
				snakePoints.set(i, snakePoints.get(i-1));
			}
			snakePoints.set(0, newStart);
			if(elongate) {
				for(int i=0; i<6; i++) snakePoints.add(temptail);
				elongate = false;
			}
		}
		
	}
	
	public boolean snakeCollision() { //if snake collides with itself
		int x = this.getX();
		int y = this.getY();
		for(int i = 1; i<snakePoints.size(); i++) { // getX and getY get the head of the snake and if any point except the head equals this means a bam! collision
			if(snakePoints.get(i).getX() == x && snakePoints.get(i).getY()==y) { 
				return true;				
			}			
		}
		return false;
	}
	
	public boolean isMoving() {
		return isMoving;
	}
	
	public void setIsMoving(boolean b) {
		isMoving = b;
	}
	
	public int getXdir() {
		return xDir;
	}
		
	public int getYdir() {
		return yDir;
	}
	
	public void setXdir(int x) {
		this.xDir = x;
	}
	public void setYdir(int y) {
		this.yDir = y;
	}
	
	//to get the position of the snake starting at its head
	public int getX() {
		return snakePoints.get(0).getX(); //gets the first element in the list and returns it x(remeber getX() is from Point Class)		
	}
	
	public int getY() {
		return snakePoints.get(0).getY();
	}
	
	public void setElongte( boolean b) {
		elongate = b;
	}
	

}
