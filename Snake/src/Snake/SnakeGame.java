package Snake;
import java.applet.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame extends Applet implements Runnable, KeyListener{
	Graphics gfx;
	Image img;
	Snake snake; //create a snake
	Token token; //creates a token
	Font f1,f2;
	boolean gameOver;
	Thread thread;
	public void init() {
		this.setFocusable(true);
		this.addKeyListener(this);
		this.resize(400, 400);
		f1 = new Font("Arial",Font.BOLD,30);    
	    f2 = new Font("Forte",Font.PLAIN,26);
		this.setBackground(Color.black);
		snake = new Snake();
		token = new Token(snake);
		img = createImage(400,400);
		gfx = img.getGraphics();		
		thread = new Thread(this); //for the runnable
		thread.start();		
	}
	
	public void paint(Graphics g) {
		if(!gameOver) {
			snake.draw(g);
			token.draw(g);
		}
		else {
			g.setColor(Color.red);
			g.setFont(f1);
			g.drawString("Game Over", 120, 150);
			g.setFont(f2);
			g.drawString("Score : " + token.getScore(), 150, 170);
		}
		
		
		//g.drawImage(img,0,0,null);		
	}
	
//	public void repaint (Graphics g) {
//		paint(g);
//	}
//	
//	public void update (Graphics g) {
//		paint(g);
//	}
	
	
	public void run() {
		for(;;) {
			if(!gameOver) {
				snake.move();
				token.tokenCollision(); //set a random token and moved if the snake eats it
				this.checkGameOver();
			}
			snake.move();
			this.checkGameOver();
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}				
	}
	
	public void checkGameOver() {
		if(snake.getX()<0 || snake.getX()>396) {
			gameOver = true;
		}
		
		if(snake.getY()<0 || snake.getY()>396) {
			gameOver = true;
		}
		
		if(snake.snakeCollision()) gameOver=true;
		
	}
	

	
	public void keyPressed(KeyEvent e) {
		if(!snake.isMoving()) {
			if(e.getKeyCode()== KeyEvent.VK_W ||e.getKeyCode()== KeyEvent.VK_S || e.getKeyCode()== KeyEvent.VK_D) {
				snake.setIsMoving(true);
			}
		}
		
		if(e.getKeyCode()== KeyEvent.VK_W) {
			if(snake.getYdir() !=1) { //if not going down
				snake.setYdir(-1); // go up so the snake won't collapse on itself
				snake.setXdir(0); // don't move left or right
			}
			
		}
		
		if(e.getKeyCode()== KeyEvent.VK_S) {
			if(snake.getYdir() !=-1) { //if not going up
				snake.setYdir(1); // go down
				snake.setXdir(0); // don't move left or right
			}
					
		}
		if(e.getKeyCode()== KeyEvent.VK_A) {
			if(snake.getXdir() !=1) { //if not going right
				snake.setXdir(-1); // go left
				snake.setYdir(0); // don't move up or down
			}
			
		}
		
		if(e.getKeyCode()== KeyEvent.VK_D) {
			if(snake.getXdir() !=-1) { //if not going left
				snake.setXdir(1); // go right
				snake.setYdir(0); // don't move up or down
			}
			
		}
		
		
	}

	
	public void keyReleased(KeyEvent arg0) {
		
		
	}

	
	public void keyTyped(KeyEvent arg0) {
		
		
	}

}
