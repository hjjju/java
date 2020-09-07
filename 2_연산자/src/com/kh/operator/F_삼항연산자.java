package com.kh.operator;

import java.util.Scanner;

public class F_삼항연산자 {

	public void opTest() {
		//항목이 3개임 : (조건식)? 참일때 사용할 값: 거짓일 때 사용할 값
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
//		String result = (num > 0) ? "양수다." : "양수가 아니다.";
		String result = (num > 0)? "양수다" : (num == 0)? "0이다.":"음수다"
;		
		System.out.println(result);
		
//		System.out.println((num > 0)? "양수다" : "양수가 아니다");
		
	}
	
	public static void main(String[] args) {
		new F_삼항연산자().opTest(); //원래 메인메소드는 분리하는게 맞다.
	}

}
