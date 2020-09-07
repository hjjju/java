package com.kh.operator;

import java.util.Scanner;

public class A_논리부정연산자 {
	
	public static void testMethod() {
		// !논리값 : 논리값을 반대로 바꾸는 연산자
		// !true =>false , !false => true가 된다.
		
		System.out.println("ture의 부정 : " + !true);
		System.out.println("false의 부정: " + !false);
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		
		System.out.println("입력한 정수가 짝수인가? " + (num % 2 == 0) );
		System.out.println("입력하 정수가 짝수 인가? " + !(num %2 !=0));
		
		
		System.out.println("입력한 정수가 양수인가? " + (num>0));
		System.out.println("입력한 정수가 양수인가? " + !(num<=0));
	}

	public static void main(String[] args) {
		//static 메소드를 호출 할때 는 new를 사용하지 않는다.
		//클래스명.메소드명(); 으로 호출한다.
		
		A_논리부정연산자.testMethod();
		
	}

}
