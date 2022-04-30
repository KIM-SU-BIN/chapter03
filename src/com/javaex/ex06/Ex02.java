package com.javaex.ex06;		//예외 String object

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//System.out.println(a.concat(b)); // concat -> 더하기
		//System.out.println(a+b); 		//위, 아래 같음
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();			//앞 뒤의 공백제거
		System.out.println(a.trim()); 		
		
		a = a.replace("ab", "1234");  //자리수 상과 없이 변경할 문자 그대로 변경됨!!
		System.out.println(a);
		
		System.out.println("=================");
		
		
		String[] sArray = a.split(",");			//앞 뒤를 나누어줌
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[1]);
		}
			System.out.println(a);
		
		System.out.println("=================");
		
		String str = "Hello java!";		//(3)번 째 방번호 이후부터 출력 
		String result01 = str.substring(3);
		System.out.println(result01);
		
		String result02 = str.substring(1,7); 		//1번부터 7번째 전까지 출력
		System.out.println(result02);			//잘라서 생년월일 구분하는 문제 풀 수 있음!
		
		char result03 = str.charAt(8);		//주민번호에서 8번째 자릿수에 따라 여자 남자 식별 가능 
		System.out.println(result03);
				
	}

}
