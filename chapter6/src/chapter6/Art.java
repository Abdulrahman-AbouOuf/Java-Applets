package chapter6;
//********************************************************************
//Art.java         Author: Sam Cacela         Started: 2/13/15
//                                          Continued: 2/14, 2/15
//                                          Finished: 2/23/15
//
//Paints a picture of Mario chilling in a snowy, mountainous
//Sky World.
//
//Uses various elements of different games, including the
//original Super Mario Bros., Super Mario Bros. 3, and Super
//Mario World.
//
//Also serves to demonstrate the use of different shapes,
//custom-made colors, and looping for repetitive patterns (i.e. the
//brick platform).
//
//********************************************************************

import javax.swing.JApplet;
import java.awt.*;
import java.util.Random;

public class Art extends JApplet
{

public void paint (Graphics page)
{
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
  
  
  //**********************************************
  // Snowflakes
  //**********************************************
  
  Random frost = new Random();
        
  int snowday = 1;
  
  // Snow is intentionally the same color as cloud2
        
  while (snowday <= (AppletWidth))
     {
     int Butter = frost.nextInt((AppletWidth - 3));
     
     // subtract 3 so snowflakes
     // are contained within
     // the picture
     
                                               
     int Jam = frost.nextInt((AppletHeight - 3));   
     int size = 3;
     
     page.fillOval (Butter, Jam, size, size);
     snowday++;
     }
     
  
  //**********************************************
  // Far mountain range
  //**********************************************
  
  Color mtnrange = new Color (190, 78, 200); // dull, lightish purple
  
  page.setColor (mtnrange);
  
  int xcoord = 0;     // starting position defined by a
                      // value on the x-axis
                      
  double Hz = .04;    // Frequency of waves
  double Amplitude = .00029;
        
  while (xcoord < AppletWidth)
     {
     double waveFunction = Amplitude * Math.sin(xcoord * Hz);
     int topOfWave = (int) (waveFunction * AppletHeight / .0006);
     page.fillRect (xcoord, ((topOfWave/8)+86), 1, AppletHeight - ((topOfWave/8)+86));
     xcoord++;
     }
     
  
  
  
  //**********************************************
  // Mountains
  //**********************************************
  
  
  Color mountain1 = new Color (180, 0, 235); // purple
  
  page.setColor (mountain1);
  page.fillOval (140, 19, 42, 42);  // tall purple
  page.fillRect (140, 40, 44, 123); // mountain
  
  Color mtn1shine = new Color (235, 160, 255); // light
                                               // purple
  
  page.setColor (mtn1shine);
  page.fillOval (149, 24, 24, 24);
  
  page.setColor (mountain1);
  page.fillOval (153, 24, 24, 48);
  
  page.setColor (mtn1shine);
  page.fillRect (149, 35, 6, 47);
  
  page.setColor (mountain1);
  page.fillRect (146, 43, 17, 7);      // space between shines
  
  Color cloud3 = new Color (250, 205, 255);  // rightmost
                                             // cloud
  
  page.setColor (cloud3);
  page.fillOval (168, 37, 102, 17);
  
  Color mountain2 = new Color (80, 184, 198); // green-blue
  
  page.setColor (mountain2);
  page.fillOval (160, 85, 50, 50);  // short green
  page.fillRect (160, 110, 52, 93); // mountain
  
  Color mtn2shine = new Color (102, 235, 253); // light 
                                               // green-blue
  
  page.setColor (mtn2shine);
  page.fillOval (171, 92, 18, 18);
  
  page.setColor (mountain2);
  page.fillOval (176, 92, 18, 36);
  
  page.setColor (mtn2shine);
  page.fillRect (171, 101, 6, 12);
  
  page.setColor (mountain2);
  page.fillRect (167, 101, 30, 4); // space between shines
  
        
  Color mountain3 = new Color (115, 203, 248); // light blue
  
  page.setColor (mountain3);
  page.fillOval (23, 46, 38, 38);  // blue
  page.fillRect (23, 65, 40, 138); // mountain
  
  Color mtn3shine = new Color (200, 245, 255); // very light blue
  
  page.setColor (mtn3shine);
  page.fillOval (30, 50, 16, 16);
  
  page.setColor (mountain3);
  page.fillOval (34, 50, 16, 32);
  
  page.setColor (mtn3shine);
  page.fillRect (30, 58, 5, 20); 
  
  page.setColor (mountain3);
  page.fillRect (26, 62, 25, 5);       // space between shines
  
  
  //*********************************************
  // Brick Platform
  //*********************************************
  
  
  Color mortar = new Color (128, 128, 128); // gray
  
  page.setColor (mortar);                   // mortar
  page.fillRect (0, 140, 300, 63);


  Color bricks = new Color (130, 40, 40);    // chocolate brown
  
  page.setColor (bricks);

  layer = 140;
  
  while (layer >= 140 && layer < 200) {    // vertical layers 
                                           // of bricks
        
        count = 0;
        
        while (count >= 0 && count < 295)    {
              
              page.fillRect (count, layer, 8, 3); // layers 1, 3, 5
              
              count = count + 9;                  // continues for 1
                                                  // horizontal row
              
              }
              
        count = (9/2);
        
        while (count >= (9/2) && count < 295)  {
              
              page.fillRect (count, layer + 4, 8, 3); // layers 2, 4, 6
              
              count = count + 9;                      // continues for 1
                                                      // horizontal row
              
              }
              
        layer = layer + 8;                   // shifts down 2
                                             // layers of bricks
                                             // (brick height = 3;
                                             // mortar height = 1;
                                             // 2 layers = 2*(3+1)
                                             // = 8
        
        }    
  
  
  //***************************************************
  // Sky and cloud at bottom (flanking brick platform)
  //***************************************************
  
  
  page.setColor (mtnrange);
  page.fillRect (0, 140, 14, 63);    // bottom right sky
  page.fillRect (268, 140, 32, 63);  // bottom left sky
                                     // (hides bricks)
  
  page.setColor (cloud3);
  page.fillRect (268, 165, 32, 38);  // bottom right lightest
  page.fillRect (0, 165, 14, 38);    // bottom left lightest
  
  Color icecream = new Color (245, 195, 255);
  page.setColor (icecream);          // transition color
                                     // between cloud2
                                     // and cloud3
                                     
  page.fillRect (268, 165, 32, 17);  // bottom right lighter
  page.fillRect (0, 165, 14, 17);    // bottom right lighter
  
  page.setColor (cloud2);
  page.fillRect (268, 165, 32, 8); // bottom right darker
  page.fillRect (0, 165, 14, 8);   // bottom left darker
  
  page.setColor (cloud1);
  page.fillRect (268, 165, 32, 3); // bottom right darkest
  page.fillRect (0, 165, 14, 3);   // bottom left darkest
  
  
  //*****************************************
  // Under brick floor
  //*****************************************
  
  
  page.setColor (mtnrange);                
  page.fillRect (123, 155, 44, 48);
  
  page.setColor (mountain1);
  page.fillRect (140, 155, 27, 48);    // purple mtn
                                       // under
  
  page.setColor (mountain2);
  page.fillRect (160, 155, 7, 48);     // green mtn
                                       // under
  
  page.setColor (cloud3);
  page.fillRect (123, 165, 44, 38);    // clouds under
  
  page.setColor (icecream);
  page.fillRect (123, 165, 44, 17);
  
  page.setColor (cloud2);
  page.fillRect (123, 165, 44, 8);
  
  page.setColor (cloud1);
  page.fillRect (123, 165, 44, 3);
  
  
  //**********************************************
  // Mystery Box
  //**********************************************
  
  
  Color question = new Color (255, 88, 0); // orange
  
  page.setColor (question);
  page.fillRect (109, 47, 20, 20);         // orange top                                               
                                           // and left of
                                           // outline
  
  Color block = new Color (255, 225, 0);   // yellow
  
  page.setColor (block);
  page.fillRect (110, 48, 18, 18);        // yellow
                                          // block body
  
  page.setColor (Color.black);         // ? block
  
  page.fillRect (109, 66, 20, 1);      // black bottom
                                       // of outline
                                       
  page.fillRect (128, 47, 1, 20);      // black right
                                       // of outline
                                       
  page.fillRect (109, 47, 1, 1);       // top left corner
                                       // of outline
                                       
  page.fillRect (111, 49, 1, 1);       // box bolts
  page.fillRect (126, 49, 1, 1);
  page.fillRect (111, 64, 1, 1);
  page.fillRect (126, 64, 1, 1);
  
  page.fillRect (114, 51, 3, 6);       // ? mark shadow
  page.fillRect (117, 51, 3, 1);
  page.fillRect (120, 52, 5, 6);
  page.fillRect (118, 58, 3, 3);
  page.fillRect (118, 62, 3, 3);
  
  
  page.setColor (question);            // orange
  page.fillRect (114, 50, 8, 1);       // ? mark
  page.fillRect (112, 51, 4, 5);
  page.fillRect (120, 51, 4, 5);
  page.fillRect (118, 56, 6, 1);
  page.fillRect (117, 57, 3, 3);
  page.fillRect (117, 61, 3, 3);
  
  
  //*********************************************
  // Super Mario
  //*********************************************
  
  
  Color clothes = new Color (225, 38, 38); // red
  
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
  
  
  //*****************************************************
  // Pipe
  //*****************************************************
  
  
  page.setColor (Color.black);             
  page.fillRect (224, 79, 32, 61);         // pipe outline
  
  Color pipe = new Color (80, 255, 30);
  
  page.setColor (pipe);                    // bright green
  page.fillRect (225, 80, 30, 60);         // pipe body
  
  Color shine = new Color (40, 128, 15);   // light bright green
  
  page.setColor (shine);
  page.fillRect (230, 80, 3, 60);          // pipe shines
  page.fillRect (239, 80, 2, 60);
  page.fillRect (243, 80, 7, 60);
  
  Color fadeshine = new Color (54, 170, 20); // transition color
                                             // between shine and
                                             // pipe
  
  page.setColor (fadeshine);
  page.fillRect (250, 80, 3, 60);
  
  
  page.setColor (Color.black);             
  page.fillRect (222, 70, 36, 17);         // pipe top outline
  
  page.setColor (pipe);
  page.fillRect (223, 71, 34, 15);         // pipe top body
  
  page.setColor (shine);
  page.fillRect (227, 71, 3, 15);          // pipe top shines
  page.fillRect (237, 71, 2, 15);
  page.fillRect (242, 71, 9, 15);
  
  page.setColor (fadeshine);
  page.fillRect (251, 71, 4, 15);
  
  page.setColor (Color.black);
  page.fillRect (225, 87, 30, 1);
  
  }
  
}
