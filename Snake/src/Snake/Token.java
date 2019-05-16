package Snake;

import java.awt.Color;
import java.awt.Graphics;

public class Token {
	private int x,y,score;
	private Snake snake;
	
	public Token(Snake s) {
		x = (int)(Math.random()*395);
		y = (int)(Math.random()*395);
		snake =  s;
	}
	
	public void changePosition() { //to change the token when the snake hits it
		x = (int)(Math.random()*395);
		y = (int)(Math.random()*395);
	}
	
	public int getScore() {
		return score;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, 6, 6);
	}
	
	public boolean tokenCollision() {//if the snake hits the token
		int snakeX = snake.getX() +2; //get the snake head position ,  the 2 added is to get the midde of the head
		int snakeY = snake.getY()+2;
		
		if(snakeX>=x-1 && snakeX<=(x+7)) { //since the token is 6 in size the 7 and 1 are used so any touched bit of the token
			if(snakeY>=y-1 && snakeY<=(y+7)) {
				changePosition(); //if the snake hits the token, randomize another token function
				snake.setElongte(true);
				score++;
				return true;
			}
		}
		return false;
		
	}

}
