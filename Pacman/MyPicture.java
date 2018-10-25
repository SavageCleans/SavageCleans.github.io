// This applet MyPicture is a teaching aid for ICS 1A. See Lab manual for details.
// Written by Norman Jacobson, September 1998
// Based on Pacman, orginally written by Eamonn Keogh, September 1997.
// Recoded for Graphics2D by Norman Jacobson, September 2002


import java.awt.*;
import java.awt.geom.*;
import java.applet.*;

public class MyPicture extends Applet
{

    // init(): called once, when applet is first invoked
    //         clears the layout (wipes the window clean) and
    //         set its size
	public void init()
	{
		setLayout(null);
		resize(500,300);	// change to size of window youy wnat!
	}

    //paint(): called by Applet each time the graphics window changes
    //         draws the maze and moves the Pacman through it
	public void paint(Graphics g)
	{

		Graphics2D g2 = (Graphics2D)g;	// Enable use of Graphics2d;
										// use g2, instead of g, throughout your program

		// graphics methods to paint and animation your picture go here
	}

	public void pause(long amountOfTime)
	{
		//a pause method, similar to that used in Pacman, will be
		//needed (so you can animate your picture)
	}
}
