package com.kh.chap00_beforeTest;

import java.util.Random; 
//import java.util.*; 
//import java.lang.*; //jvm이 컴파일할때 자동으로 추가해주는 구문

public class MathTest {
	/* 
	 * 자바에서는 클래스가 제공하는 필드(전역변수)나 메소드 사용시
	 * 반드시 new를 사용해 객체를 생성해야 사용 할 수 있다
	 * 해당하는 주소를 가진 레퍼런스 변수를 이용해 실행해야만 한다.
	 * 클래스명 레퍼런스 변수명 = new 클래스명();
	 * 레퍼런스변수명.메소드명();   -> non-static메소드일경우 호출하는방법
	 * 
	 * 
	 * static 메소드의 경우 호출하기 위해서 new를 사용하지 않아도 된다.
	 * 클래스명.메소드명();  ->static 메소드인 경우 메소드 호출방법
	 * 클래스명.필드명;  ->static 필드에 대한 접근
	 * 
	 * */
	
	
	public void testMath() {
		System.out.println("-7의 절대값 : " + Math.abs(-7));
		
		
		System.out.println("상수PI : "+ Math.PI);
		
//		System.out.println(2*3.14);
//		int radius = 2;
//		System.out.println(radius * Math.PI);
		
		
		
		
		//난수 : 무작위로 추출되는 알 수 없는 값(random) 0.0 ~0.9999...
//		System.out.println("임의의 난수 : " + Math.random());
		
		
		
	}
	
	
	
	public void practiceRandom() {
		//사용자가 원하는 랜덤 범위의 값 추출하기
		//0~ 9까지의 랜덤수
		//1~10까지의 랜덤수
		//20 ~ 35까지의 랜덤수
		//0또는 1 
		// -128~ 127까지의 랜덤수
		
		//위의 5가지 범위의난수를 출력하는 구문을 작성해 보세요(실습
		//단, Math.Random()과 Random 클래스의nextInt 를 이용한 구문 둘 다작성하세요
		
		
		
		int num1 = (int)(Math.random()*10 );
		
		System.out.println("0 ~ 9까지의 랜덤수A " + num1);
		
		int num11 = new Random().nextInt(10);
		System.out.println("0 ~ 9까지의 랜덤수B " + num11);
		
		
		int num2 = (int)(Math.random()*10)+1;
		System.out.println("1~10까지의 랜덤수A : " + num2);
		
		int num22 = new Random().nextInt(10) +1;
		System.out.println("1~10까지의 랜덤수B : "  + num22);
		
		
		int num3 = (int)(Math.random()*16)+20;
		System.out.println("20 ~ 35까지의 랜덤수 : " + num3);
		
		int num33 = new Random().nextInt(16) + 20;
		System.out.println("20 ~ 35까지의 랜덤수: " + num33);
		
		
		int num4 = (int)(Math.random()*2);
		System.out.println("0또는 1 : "+ num4);
		
		int num44 = new Random().nextInt(2);
		System.out.println("0또는 1 : "+ num44);
		
		
		int num5 = (int)(Math.random()*256) -128;
		System.out.println("-128~ 127까지의 랜덤수 : "+ num5);
		
		int num55 = new Random().nextInt(256) -128;
		System.out.println("-128~ 127까지의 랜덤수 : "+ num55);
		
		
		
	}
	
	
	
	
	
	public void testRandom() {
		
		//1부터 100 사이의 난수 발생
		int random  = (int) (Math.random() * 100) +1; //얘는 임포트 안함 ->결론 java.lang패키지에 있는 클래스들은 임포트 안하고 쓸 수있음
		
		
		System.out.println(random);
		
		
		int random2 = new Random().nextInt(100) + 1; // nextInt()는 0부터 괄호안의숫자전까지의 난수를 발생시키는 메소드
		
		System.out.println(random2);
	}
	
	
	public static void main(String[] args) {
		MathTest test = new MathTest();
		
//		test.testMath();
//		test.testRandom();
		test.practiceRandom();
		
	}

}
