package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		//new 새로 만들기 때문에 / String은 이렇게 잘 안씀 하단의 s03처럼 사용
		String s01 = new String ("안녕하세요");
		String s02 = new String ("안녕하세요");
	
		System.out.println(s01.toString());
		System.out.println(s02.toString());
		
		System.out.println(s01 == s02);
		
		
		System.out.println("===========");
		//같으면 만들지않는 다는 것의 의미는 -> "하이"+"하이"를 합쳐 "하이하이" 수정을 하는 것이 아니라 아예 새로 만드는 것임!!!
		String s03 = "하이";
		String s04 = "하이";
		
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 ==s04);
		
		System.out.println("===========");
		
		s03="하이하이";
		System.out.println(s03.toString());
		System.out.println(s04.toString()); 		
		System.out.println(s03 ==s04);

	}

}
