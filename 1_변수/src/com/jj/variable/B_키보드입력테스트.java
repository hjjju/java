package com.jj.variable; //패키지 선언문 

import java.util.Scanner; //임포트 선언문
 
public class B_키보드입력테스트 {//클래스 선언문
	private int a =1; //멤버변수 ,인스턴스변수
	
	

	public void inputTest() { //멤버함수
		//Scanner의 앞글자가 대문자다 ! 뭐다? 클래스다!
		//이렇게 하면 다른패키지에서 제공하는 클래스를 사용할 수있다.
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름을 입력하세요:");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요");
		int age =sc.nextInt();
		
		System.out.print("키(소수점 첫 째 자리까지 입력) :");
		double height =sc.nextDouble();
		
		System.out.println(name +"님은 "+ age+ "세이며,키는 "+height+"cm 입니다.");
	}
	public static void main(String[] args) {
		B_키보드입력테스트 test = new B_키보드입력테스트();
		test.inputTest(); //메소드 호출
		
	}

}
