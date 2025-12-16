package com.BrickBreak;

import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private static final int MAX_SPEED = 6;
	private static final int MIN_SPEED = -6;
	
	private int speed;
	private int x;
	private int y;
	private int height;
	private int width;
	
	
	//constructor(s):
	public Paddle(int x,int y, int width, int height){
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		speed = 0;
	}
	//methods:
	public void draw(Graphics g){
	g.setColor(Color.white);
	g.fillRect(x, y,width,height);
}
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
	public void addVelocity(int addedSpeed){
		speed = clampSpeed(speed + addedSpeed);
	}

	private int clampSpeed(int s){
		if(s > MAX_SPEED) return MAX_SPEED;
		if(s < MIN_SPEED) return MIN_SPEED;
		return s;
	}
}

