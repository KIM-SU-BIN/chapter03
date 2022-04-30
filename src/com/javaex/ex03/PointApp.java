package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point(2,3);
		Point p02 = new Point(2,3);
		Point p03 = new Point(2,2);
		Point p04 = p01;
		
		System.out.println(p01 == p02); //Q. 스택의 번호가 같냐고 물어본거임
	
		System.out.println(p01.equals(p02));		//논리비교
		System.out.println(p02.equals(p01));    //논리비교
		
		System.out.println(p01.equals(p03));
		System.out.println(p02.equals(p03));
		
		System.out.println("================");
		System.out.println(p01 == p04);
		System.out.println(p01.equals(p04));
	}

}
