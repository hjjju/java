package com.kh.example2;

import java.util.Scanner;

public class CastingSample {
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력: ");
		
		char ch = sc.nextLine().charAt(0);
		
		System.out.printf("%s is unicode : %d",ch,(int)ch);
	}
	
	
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어: ");
		double kor = sc.nextDouble();
		System.out.printf("영어: ");
		double eng = sc.nextDouble();
		System.out.printf("수학: ");
		double mat = sc.nextDouble();

		System.out.println("총점: "+ (int)(kor+eng+mat));
		System.out.println("평균: "+(int)(kor+eng+mat)/3);
		
	}
}
