package com.javaex.ex05;

public class Rectangle {
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	//gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	//메소드
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	
}
