package com.jj.variable;

import java.util.Scanner;

public class C_변수값변경테스트 {
	public void changeVAlue() {
		//변수선언
		String name;
		char gender;
		int age;
		double height;
		
		name ="허현주";//초기화
		gender='W';
		age=20;
		height=164.1;
		
		//변수값 출력
		System.out.println(name +"님의 개인정보");
		System.out.println("gender:" +gender);
		System.out.println("age: "+age);
		System.out.println("height: "+height);
		
		//키보드 값 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");
		name= sc.nextLine();
		
		System.out.println("성벼을 입력하세요: ");
		
		//M을 입력하면-> 문자열 형태로 가져오고 0번쩨 있는것을 문자로 바꿔준다.
		gender = sc.nextLine().charAt(0);//문자열에서 내가 원하는 위치의 글자만 빼오면? ->문자
		
//		System.out.println("hello".charAt(1));
		
		System.out.println("나이를 입력하세요");
		age= sc.nextInt();
		
		System.out.println("키를 입력하세요");
		sc.nextDouble();
		
		System.out.println("변경된 "+name+"님의 개인정보");
		System.out.println("gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("height: "+height);
		
	}

	public static void main(String[] args) {
		C_변수값변경테스트 test = new C_변수값변경테스트();
		test.changeVAlue();
	}

}
