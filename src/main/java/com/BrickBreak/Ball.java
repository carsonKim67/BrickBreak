//Carson Kim
//Ball class for Brick Breaker Game - represents the ball that bounces around the screen
package com.BrickBreak;
import java.awt.*;

public class Ball {
	
    //instance variables:	
	private int x;
	private int y;
	private int radius;
	private int speedX;
	private int speedY;
	
	
	//constructor(s):
	//pre condition: radius is the diameter of the ball
	//post condition: creates a ball object at position (x,y) with the given radius
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
//pre condition: g is the Graphics object to draw on
//post condition: draws the ball on the screen
public void draw(Graphics g){
	g.setColor(Color.white);
	g.fillOval(x, y, radius, radius);
}
//pre condition: there is a ball object
//post condition: moves the ball according to its velocity
public void move(){
	x+=speedX;
	y+=speedY;
}
//pre condition: paddle touches the ball
//post condition: reverses the ball's y velocity
public void reverseY(){
	speedY = -speedY;
}
//pre condition: paddle touches the ball
//post condition: reverses the ball's x velocity
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
