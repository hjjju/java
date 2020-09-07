package com.kh.operator;

public class B_증감연산자 {

	public void test1() {
		//++ : 1증가의 의미, ++값, 값 ++로 사용한다.
		//-- : 1감소의 의미, --값, 값 --로 사용한다.
		
		int age = 20;
		System.out.println("현재 나이는? " + age);
		
		++age;
		
		System.out.println("++age의 결과는? " + age);
		
		age++;
		System.out.println("a++의 결과는 ? " + age);
		
		--age;
		System.out.println("--a의 결과는? " + age);
		
		age--;
		System.out.println("age--의 결과는? " + age);
	}
	
	public void test2() {
		int num1 = 20;
		int result = num1++ *3;
		
		System.out.println("result : " + result);
		System.out.println("num 1: " + num1);
		
		int num2 = 20;
		int result2 = ++num2 *3;
		
		System.out.println("result2 : " + result2);
		System.out.println("num2: " + num2);
	}
	
	public static void main(String[] args) {
//		B_증감연산자 test = new B_증감연산자();
//		test.test1();
		
//		new B_증감연산자().test1(); // test대신 안에 담겨 있던 new B_증감연산자() 를 바로이용해서 .test1
		new B_증감연산자().test2(); 
	}

}
