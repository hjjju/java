package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class B_ifElse {

	public void testIfEsle2() {
		//숫자를 하나 입력 받아 양수인지 음수인ㄴ지 출력
		//단, 0이면 "0입니다. 라고 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num ==0) {
			System.out.println("0이다.");
		}else {
			if(num >0 ) {
				System.out.println("양수다.");
			}else {
				System.out.println("음수다");
			}
		}
		
		
	}
	
	
	
	public void testIfElse3() {
		//정수 두개를 입력받아, 두수의 산술연산을 처리해서 출력하세요.
		//단, 두수 모두 반드시 1부터 100사이의값이여야한다.
		//둘중에 하나라도 범위에 속하지 않으면
		//"값은 1부터 100사이어여 합니다." 라고 출력되게 해야한다.
		
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력 :");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(!(num1 >0 && num1 <=100 && num2>0 && num1<=100)) {
			System.out.println("값은 1부터 100사이여야 합니다. ");
		}else {
			System.out.println("num + num2 : " + (num1 + num2));
			System.out.println("num - num2 : " + (num1 - num2));
			System.out.println("num * num2 : " + (num1 * num2));
			System.out.println("num / num2 : " + (num1 / num2));
			System.out.println("num % num2 : " + (num1 % num2));
		}
		
		
	}
}
