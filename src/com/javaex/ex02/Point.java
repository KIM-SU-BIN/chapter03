package com.javaex.ex02;

public class Point {
	
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드  
	//메소드 유무에 따라 결과값이 달라짐 / 없으면 스택 고유 번호 출력!
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
