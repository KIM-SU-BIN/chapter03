package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = p02;
		
		
		//System.out.println(p01.getX());
		
		//point클래스의 부모로 object클래스를 자동으로 상속한다.
		
		//클래스 정보 보기
		System.out.println(p01.getClass());
		
		System.out.println("========================");
		//System.out.println(p01.equals(p01));		//우리가 이퀄스를 만든 적 없지만 부모클래스가 가지고 있기 때문에 사용 가능함 
		
		//클래스(=인스턴스)의 정보 보기 -->> Print의 toString() 재정의 전후 비교
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		
	
		//메모리의 주소값에 대응되는 중복되지 않는 숫자
		System.out.println("=======해쉬코드======");
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		
		System.out.println("========================");
		System.out.println(p01.equals(p02)); //결과값 : false
		System.out.println(p02.equals(p01));
		
		
		System.out.println(p01.equals(p01));		//본인과 본인을 비교한 것 -> 결과값 : true
		System.out.println(p02.equals(p03));
		
		System.out.println("========================");
		//Q. p00과 p01 같을까? 안의 값을 비교하면 같지만 메모리 위치로 보면 다름
		System.out.println(p00.equals(p01));		//결과값 : false
	
		// == 변수의 값이 같냐?
		//기본자료형은 실제 값이값이냐?
		//기본자료형은 이외외 값은 (주소) 주소가 같냐?
		
		System.out.println(p00==p01);
		System.out.println(p01==p02);
		System.out.println(p02==p00);
		System.out.println(p02==p03);		//주소가 같다so it's true
		
	
	
	}

}
