//Wrapper class
package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		int i00 = 3;
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(20);

		// 예외적용
		short s = new Short((short) 3); // 그냥 (3); 쓰면 인티저로 인식하기 때문에 형변환 필요함!
		Byte b = new Byte((byte) 3);

		Integer iResult = new Integer(3) + new Integer(5);
		System.out.println(iResult);

		Integer no = 3; // string처럼 약식으로 사용가능 Integer no =Integer(3); , 박싱
		int r01 = no.parseInt("1234"); // 문자열을 정수로 변경해줌
		System.out.println(r01 + 1);

		int r02 = Integer.parseInt("12345"); // 중간Integer 클래스명일 수 있으니 대소문자 확인하고 사용하기, 대문자: 클래스명, 소문자:속성
		System.out.println(r02);

		Integer no2 = 100;
		int no3 = no2; // 언박싱

		// 정수를 문자열로 변경
		// 555 -->> "555"
		String str = "안녕하세요";
		String str01 = str.valueOf(555);
		System.out.println(str01 + 1);

		String str02 = String.valueOf(555); // 정수를 문자열로 변경
		System.out.println(str02);

		// 정수 -->>문자열
		String str03 = "" + 555; // 문자열 + 정수 -->> 문자열

	}

}
