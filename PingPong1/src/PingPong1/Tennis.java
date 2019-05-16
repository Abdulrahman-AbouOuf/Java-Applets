package PingPong1;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.*;
import java.applet.*;
import java.io.IOException.*;
import java.applet.AudioClip;


public class Tennis extends Applet implements Runnable, KeyListener{
	final int WIDTH = 700, HEIGHT=500;
	HumanPaddle p1;
	HumanPaddle p2;
	Ball b1;
	Font f1;
	Graphics gfx;
	Image img;
	Thread thread;
	Label testLabel;
		
	//private static final long serialVersionUID = 2530894095587089544L;	     
    //private AudioClip clip; 
    
	public void init() {
		this.resize(WIDTH, HEIGHT);
		this.setFocusable(true);
		this.addKeyListener(this);	 
		f1 = new Font("Arial",Font.BOLD,30);
	    //clip = getAudioClip(getDocumentBase(), "http://www.myserver.com/clip.au");       
        
		p1 = new HumanPaddle(1); //makes aPaddle in the Left from the created class
		p2 = new HumanPaddle(2);
		b1 = new Ball();
		img = createImage(WIDTH,HEIGHT);
		gfx = img.getGraphics();
		thread = new Thread(this);
		thread.start();	
		
	}
	
	public void paint (Graphics g) {
		this.setBackground(Color.blue);
		g.setColor(Color.white);
		g.fillRect(0, 250, WIDTH, 20);
		g.setColor(Color.DARK_GRAY); //setting the ping pong table
		g.fillRect(350, 0, 5, HEIGHT);
		super.paint(g);
		
		if(b1.getX()<-10 || b1.getX()> 710) {
			g.setColor(Color.red);//after the game is over
			g.setFont(f1);
			g.drawString("Game Over", 260, 250);
		}
		else {
			p1.draw(g);		
			p2.draw(g);
			b1.draw(g);
		}
		
	}
	
//	public void update(Graphics g) {
//		//paint(g);
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;;) {
			
			p1.move();
			p2.move();
			b1.move();
			b1.checkPaddleCollision(p1, p2); // check collision
			
			repaint(); //to run the game over and over	
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p1.setUpAccel(true);			
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			p1.setDownAccel(true);
		}
		
		if(e.getKeyCode() == KeyEvent.VK_O) {
			p2.setUpAccel(true);			
		}
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			p2.setDownAccel(true);
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p1.setUpAccel(false);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			p1.setDownAccel(false);
		}
		
		if(e.getKeyCode() == KeyEvent.VK_O) {
			p2.setUpAccel(false);			
		}
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			p2.setDownAccel(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
