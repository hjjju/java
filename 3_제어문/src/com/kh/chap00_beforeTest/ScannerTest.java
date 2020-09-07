package com.kh.chap00_beforeTest;

import java.util.Scanner;

public class ScannerTest {

	public void testScanner() {
		//java.util.Scanner 클래스의next(), nextLine() 테스트
		//next() : 공백이 없는 연속된 문자열의 값 입력시 사용
		//nextLine() : 공백이 포함된 문자열 값 입력시 사용
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		System.out.println("str : " + str);
		
		System.out.print("정수 하나 입력 :");
		int num = sc.nextInt();  //정수만큼만 읽어오기 때문에 버퍼에 enter값이 남아있다
		
		System.out.println("num : " + num);
		
		System.out.print("공백이 있는 문자열을 입력하세요 : ");
		sc.nextLine();// 엔터는 얘가 읽어버림
		
		
		String str2 = sc.nextLine();
		
		System.out.println("str2 : " + str2);
		
	}
	
	public static void main(String[] args) {
		ScannerTest st = new ScannerTest();
		st.testScanner();
	
		
		
		
	}

}
