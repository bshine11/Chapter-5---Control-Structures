/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 9-30-15             
 * Control Structure                 *
 *                                   *
 ************************************/

//Lab05vst.java
//Student version of the Lab05 assignment.

import java.awt.*;
import java.applet.*;

public class Lab05vst extends Applet {

	public void init() {
		setSize(1000, 700);
	}

	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
		g.drawRect(10, 10, width, height);
		int x;
		int y;
		int xCoord;
		int yCoord;
		// Draw bottom-left corner
		x = 990;
		y = 640;
		xCoord = 10;
		yCoord = 640;
		for (int k = 0; k <= 50; k++) {
			g.drawLine(x, y, xCoord, yCoord);
			x -= 19;
			yCoord -= 11;
		}
		// Draw bottom-right corner
		x = 10;
		y = 640;
		xCoord = 990;
		yCoord = 640;
		for (int j = 0; j <= 50; j++) {
			g.drawLine(x, y, xCoord, yCoord);
			x += 19;
			yCoord -= 11;
		}
		// Draw top-right corner
		x = 10;
		y = 10;
		xCoord = 990;
		yCoord = 10;
		for (int j = 0; j <= 50; j++) {
			g.drawLine(x, y, xCoord, yCoord);
			x += 19;
			yCoord += 11;
		}

		// Draw top-left corner
		x = 990;
		y = 10;
		xCoord = 10;
		yCoord = 10;
		for (int k = 0; k <= 50; k++) {
			g.drawLine(x, y, xCoord, yCoord);
			x -= 19;
			yCoord += 11;
		}
		// /////////////Little//////////
		// Draw bottom-left corner
		x = 800;
		y = 440;
		xCoord = 200;
		yCoord = 440;
		for (int k = 0; k <= 50; k++) {
			g.drawLine(x, y, xCoord, yCoord);
			x -= 12;
			yCoord -= 4;
		}
		// Draw bottom-right corner
		x = 200;
		y = 440;
		xCoord = 800;
		yCoord = 440;
		for (int j = 0; j <= 50; j++) {
			g.drawLine(x, y, xCoord, yCoord);
			x += 12;
			yCoord -= 4;
		}
		// Draw top-right corner
		x = 200;
		y = 210;
		xCoord = 800;
		yCoord = 210;
		for (int j = 0; j <= 50; j++) {
			g.drawLine(x, y, xCoord, yCoord);
			x += 12;
			yCoord += 4;
		}

		// Draw top-left corner
		x = 800;
		y = 210;
		xCoord = 200;
		yCoord = 210;
		for (int k = 0; k <= 50; k++) {
			g.drawLine(x, y, xCoord, yCoord);
			x -= 12;
			yCoord += 4;
		}
	}
}
