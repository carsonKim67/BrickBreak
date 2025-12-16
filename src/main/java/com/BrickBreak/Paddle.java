//Carson Kim
//Paddle class for Brick Breaker Game - represents the paddle controlled by the player
package com.BrickBreak;

import java.awt.*;

public class Paddle {
	//instance variables:
	private static final int MAX_SPEED = 6;
	private static final int MIN_SPEED = -6;
	private int speed;
	private int x;
	private int y;
	private int height;
	private int width;
	
	
	//constructor(s):
	//pre con - given position (x,y) and dimensions width and height
	//post con - creates a paddle object at position (x,y) with the given width
	public Paddle(int x,int y, int width, int height){
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		speed = 0;
	}
	//methods:
	//pre condition: g is the Graphics object to draw on
	//post condition: draws the paddle on the screen
	public void draw(Graphics g){
	g.setColor(Color.white);
	g.fillRect(x, y,width,height);
}	
	//pre condition: there is a paddle object
	//post condition: moves the paddle according to its velocity
	public void move(){
		x+= speed;

	}
	public int getY(){
		return y;
	}
	public int getX(){
		return x;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int getVelocity(){
		return speed;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setVelocity(int speed){
		this.speed = clampSpeed(speed);
	}
	//pre con - added speed is given
	//post con - adds the given speed to the paddle's current speed
	public void addVelocity(int addedSpeed){
		speed = clampSpeed(speed + addedSpeed);
	}
	//pre con - speed to be clamped is given
	//post con - returns the speed clamped between MAX_SPEED and MIN_SPEED
	private int clampSpeed(int s){
		if(s > MAX_SPEED) return MAX_SPEED;
		if(s < MIN_SPEED) return MIN_SPEED;
		return s;
	}
}

