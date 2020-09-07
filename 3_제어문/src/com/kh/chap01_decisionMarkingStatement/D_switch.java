package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class D_switch {
	//변수의 값을 case에서 찾아 명령을 수행하는 조건문이다.
	//해당하는 값이 없을 경우에는 default 의 명령문을 수행한다.
	
	//[표현식] 
	//switch(변수){
	//	case 1 : 실행문1 ; break; //변수의값이 1인경우 실행
	//	case 2 : 실행문2 ; break; //변수의 값이 2인경우 실행
	//	default : 실행문3; break; //변수의 값이 case에 없는 경우 실행
	//}
	
	
	public void testSwitch() {
		//정수 두 개와 연산기호문자 1개를 입력받아서,
		//연산 기호에 해당하는 계산을 수행하고 출력하세요
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("첫 번째값: ");
		int first= sc.nextInt();
		System.out.print("두 번째 값: ");
		int second = sc.nextInt();
		
		System.out.print("연산자(+,-,*,/) : ");
		char op = sc.next().charAt(0);
		
		int result =0;
		
		switch(op) {
		case '+' : result = first +second; break;
		case '-' : result = first - second; break;
		case '*'  : result = first * second; break;
		case '/' : result = first / second; break;
		default : System.out.println("연산 기호를 잘못 입력하셨습니다. "); return; //호출한곳 즉 메인메소드로 복귀
		}
		

		System.out.println(first +" " + op + " " + second + " = " +result);
		
				
	}
	
	
	public void testSwitch2() {
		//1~ 12월까지의 월을 정수로 입력받아
		//해당하는 달의마지막 날짜를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12월중 하나를 입력하세요");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 :	case 8:	case 10 :case 12: System.out.println("입력하신 월은 31일까지 입니다."); break;
		case 4 : case 6 : case 9 : case 11 : System.out.println("입력하신 월은 30일 까지입니다.");break;
		case 2 : System.out.println("입력하신월은 28일 혹은 29일 까지입니다. "); break;
		default : System.out.println("반드시 1~ 12까지를 입력해야합니다."); return;
		}
		
	}
	
	
	
	
	
	
	
}
