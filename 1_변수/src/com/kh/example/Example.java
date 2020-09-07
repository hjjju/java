package com.kh.example;

import java.util.Scanner;

public class Example {
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두 번쩨 정수: ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과: " + (num1+ num2));
		System.out.println("빼기 결과: " +  (num1-num2));
		System.out.println("곱하기 결과 : " + (num1*num2));
		System.out.println("나누기 몫; "+ (num1/num2));
		System.out.println("나누기 나머지: "+ (num1%num2));
	}
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로: ");
		double garo = sc.nextDouble();
		
		System.out.print("세로: ");
		double sero = sc.nextDouble();
		
		
		System.out.println("면적: " +(garo*sero));
		System.out.println("둘레: "+(garo+sero)*2);
		
	}
	
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오: ");
		String str = sc.nextLine();
		
		System.out.println("첫번째 문자: " + str.charAt(0));
		System.out.println("두번째 문자: " + str.charAt(1));
		System.out.println("세번째 문자: " + str.charAt(2));
		
	}
}
