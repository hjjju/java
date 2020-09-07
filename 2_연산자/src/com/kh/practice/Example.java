package com.kh.practice;

import java.util.Scanner;

public class Example {
	
	public void sample1() {
		int kor,eng,math,sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어입력 :");
		kor = sc.nextInt();
		System.out.print("영어입력 :");
		eng = sc.nextInt();
		System.out.print("수학입력 :");
		math = sc.nextInt();
		
		sum = kor+eng+math;
		
		avg = sum / 3;
		
//		if(kor >= 40  && eng >=40 && math >40) {
//		
//			if(avg >=60) {
//				System.out.println("합격");
//			}else {
//				System.out.println("불합격");
//			}
//			
//
//		}else {
//			System.out.println("불합격");
//		}
		
		String result = (kor >=40 && eng >=40 && math>=40 )? (avg >=60) ? "합격" :" 불합격" :"불합격";
		
		System.out.println("result : " +result);
	}
}
