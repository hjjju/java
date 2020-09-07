package com.kh.operator;

import java.util.Scanner;

public class E_일반논리연산자 {
	
	public void opTest1() {
		//&& (그리고, ~면서) : 11순위
		//|| (또는, ~이거나) : 12순위
		
		// 1 <= 변수 <= 100 이렇게 사용하지 못함
		// 변수 >=1  && 변수 <=100
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		System.out.println("1부터 100사이인지 확인: "+(num >= 1 && num <= 100));
		
		//영어 대문자냐?  --> 문자변수 >= 'A' &&  문자변수 <= 'Z'
		
		System.out.print("문자 하나 입력: ");
		char ch = sc.next().charAt(0); //nextLine과 같이 문자열 입력받을떄 사용
		
		
		System.out.println("영어 대문자인지 확인: " + (ch >= 'A' && ch <= 'Z'));
		System.out.println("영어 소문자인지 확인: " + (ch >= 'a' && ch <= 'z'));
		
		//우선순위 && > ||
		System.out.println("영문자 인지 확인: "
						+ ((ch>='A' && ch<= 'Z')|| (ch >= 'a' && ch<= 'z')));
		
		
		// || : 여러 조건식을 제시하고 그 중에 하나라도 맞는게 있는지 물어볼때 사용
		// 입력 문자가 대소문자 상관 없이 'y' || 'Y' 인지 확인
		
		System.out.println("계속하려면 y혹은 Y를 입력하세요 : ");
		
		char ch2 = sc.next().charAt(0);
//		char ch2 = sc.next().toUpperCase().charAt(0);
//		String str = sc.next();
//		char ch2 = str.charAt(0);
//		
//		"apple".charAt(0);
		
		
		
		
		System.out.println("영문자 y 인지 확인: " +  (ch2 =='y' || ch2 == 'Y'));
//		System.out.println("영문자 y 인지 확인: " +  (ch2 == 'Y'));
		
	}
	
	public void opTest2() {
		// 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안함
		// 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안함
		int num =10;
		
		int result = (false && ++num > 0)? num:num; 
//		int result = (true && ++num > 0)? num:num;
		
		System.out.println(result);
		
		
		result = (true || ++num > 0)? num:num;
		System.out.println(result);
		
		
	}
	
	
	//메소드의 헤드 혹은 시그니쳐라고 부른다.
	//public static void main(String[] args)
	public static void main(String[] args) { //외울것
		
		E_일반논리연산자 test = new E_일반논리연산자();
//		test.opTest1();
//		System.out.println("APPLE".toLowerCase());
		test.opTest2();
		
		
		
		
		
	}

}
