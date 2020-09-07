package com.kh.operator;

public class C_산술연산자 {
	public void opTest() {
		int num1 = 5;
		int num2 = 2;
		
		System.out.println("num1 + num2 = " + (num1 + num2)); //문자열 합치기에 주의
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		//정수 연산에 한해서 나누었을때 몺을 구하는 연산자
		System.out.println("num1 / num2 = " + (num1 / num2));
		//나누었을때 나머지를 구하는 연산자
		System.out.println("num1 % num2 = " + (num1 % num2)); //mod연산
		
		//값 % 배수 = 0  <= 어떤 수의 배수인지 물어볼때 사용한다.
		//짝수냐? (2의배수냐?)  ==> 값%2 ==0 or 값 % 2 !=1
		//홀수냐?    			==> 값%2 ==1 or 값 % 2 !=0
		//5의 배수냐? ==> 값 % 5 == 0
		
		
	}
	public static void main(String[] args) {
		new C_산술연산자().opTest();
	}

}
