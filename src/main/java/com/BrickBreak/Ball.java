//name
//destription
package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	
	private int x;
	private int y;
	private int radius;

	
	
	//constructor(s):
	
	//methods:
public void draw(Graphics g){
	g.setColor(Color.white);
	g.fillOval(x, y, radius, radius);
}
}
