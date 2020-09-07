package com.kh.chap03_branchingStatement;

import java.util.Scanner;

public class A_break {

	//break문은 반복문 내에서만 쓸 수 있음
	//단, switch문에서 예외로 사용함
	//일반적으로 if(조건식) break; 의 형식으로 사용됨.
	
	
	public void breakTest() {
		//문자열을 입력받아 글자 갯수를 출력하는 반복프로그램
		//단, "end"가 입력된면 반복을 종료함
		//do ~ while문 사용
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("문자열 입력 : ");
			 String str = sc.next();
			
			 if("end".equals(str)) { //문자열을 먼저 써야 한다 
				 break;
			 }
			System.out.println("글자 갯수 : " +str.length());
			
			
		} while (true);
		
	}
	public void breakTest2() {
		//break문을 이용하여 1부터 입력한 숫자까지의 합계 계산
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		
		int sum =0;
		
		for(int i =1; ; i++) {
			sum +=i;
			
			if(i == num ) {
				break;
			}
		}
		System.out.println("1부터 " + num + "까지의 합은 " + sum +"입니다.");
		
	}
	
}
