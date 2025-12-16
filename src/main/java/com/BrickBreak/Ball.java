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
	private int speedX;
	private int speedY;
	
	
	//constructor(s):
	public Ball(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
		speedX = 1;
		speedY = -2;
	}
	//methods:
public int getXpos(){
	return x;
}
public int getYpos(){
	return y;
}
public void setXVelocity(int speedX){
	this.speedX = speedX;
}
public int getSize(){
	return radius;
}
public void draw(Graphics g){
	g.setColor(Color.white);
	g.fillOval(x, y, radius, radius);
}
public void move(){
	x+=speedX;
	y+=speedY;
}
public void reverseY(){
	speedY = -speedY;
}
public void reverseX(){
	speedX = -speedX;
}
public void setY(int y){
	this.y=y;
}
public void setX(int x){
	this.x=x;
}
public void setYVelocity(int speedY){
	this.speedY=speedY;
}
}
