package chapter6;
import javax.swing.JApplet;
import java.awt.*;
import java.util.Random;

public class Mario extends JApplet {
	public void paint(Graphics page) {
		final int MID = 90;  // A line of reference referring to the
	    // imaginary vertical line that runs down
	    // the middle of Mario
	                               
		final int TOP = 94;  // Refers to the top of Mario's head (scalp)
	    // as a point of reference
		int count;
	    int layer;
	    int AppletHeight = 203;
	    int AppletWidth = 300;
	  //*******************************************************
	    // Sky
	    //*******************************************************
	    
	    
	    Color sky = new Color (184, 100, 255); // periwinkle-blue
	    
	    page.setColor (sky);
	    page.fillRect (0, 0, AppletWidth, AppletHeight);  // sky
	    
	    Color cloud1 = new Color (230, 140, 255);
	    
	    page.setColor (cloud1);
	    page.fillOval (30, 25, 43, 12); // leftmost
	    
	    Color cloud2 = new Color (240, 185, 255);
	    
	    page.setColor (cloud2);         // overlaps leftmost cloud
	    page.fillOval (53, 14, 77, 16);
	    
	    Color clothes = new Color (225, 38, 38); // red
	    
	  //*********************************************
	    // Super Mario
	    //*********************************************
	    
	    page.setColor (clothes);
	    page.fillOval (MID-9, TOP+17, 18, 24);   // body
	    
	    Color brown = new Color (100, 40, 0);    // dark brown
	    
	    page.setColor (brown);
	    page.fillOval (MID-6, TOP+18, 11, 12);   // shirt
	    page.fillRect (MID-5, TOP+44, 14, 2);    // shoe sole
	    page.fillRect (MID-6, TOP+42, 14, 3);    // shoe lower-body
	    page.fillRect (MID-6, TOP+41, 13, 4);    // shoe upper-body
	    page.fillRect (MID-5, TOP+40, 10, 5);    // shoe peak
	    
	    Color arm = new Color (128, 76, 0);      // lighter version
	                                             // of other brown
	                                             // used on Mario,
	                                             // slight contrast
	                                             // with shirt
	    
	    page.setColor (arm);
	    page.fillOval (MID-7, TOP+23, 11, 8);    // arm
	    
	    Color skin = new Color (255, 190,20);    // Mario's skin color
	    
	    page.setColor (skin);
	    page.fillOval (MID+4, TOP+24, 5, 6);     // hand
	    page.fillOval (MID-10, TOP, 20, 20);     // head

	    page.setColor (Color.black);
	    page.fillRect (MID+6, TOP+6, 2, 4);      // eye
	    
	    page.setColor (skin);
	    page.fillOval (MID+9, TOP+8, 5, 6);      // nose
	    
	    page.setColor (brown);
	    page.fillRect (MID+2, TOP+14, 9, 2);     // mustache
	    page.fillRect (MID+4, TOP+12, 2, 4);     // mustache curl
	    
	    page.fillRect (MID-10, TOP, 9, 19);      // hair
	    page.fillRect (MID-12, TOP+5, 11, 11);   // back of hair
	    
	    page.setColor (clothes);
	    page.fillRect (MID-10, TOP-1, 19, 5);    // hat base
	    page.fillRect (MID-10, TOP+2, 21, 2);    // upper visor
	    page.fillRect (MID-10, TOP+3, 23, 1);    // lower visor
	    page.fillRect (MID-7, TOP-3, 15, 7);     // hat crown
	    page.fillRect (MID-3, TOP-5, 9, 8);      // hat top
	    
	    page.setColor (skin);
	    page.fillRect (MID-7, TOP+8, 3, 6);      // ear
	    page.fillRect (MID-5, TOP+12, 4, 7);     // jaw below ear
	    
	    page.setColor (brown);
	    page.fillRect (MID-4, TOP+11, 5, 2);     // sideburn
	    page.fillRect (MID-4, TOP+4, 5, 4);      // top hairline  
		
	}       

}
