package com.jj.variable;


public class D_상수테스트 {

	public void testFinal() {
		//상수테스트
		int age;
		final int AGE; //상수는 변수선언 앞에 final +전부 대문자
		
		age =20;
		AGE =20;
		
		System.out.println("age: "+age); //변수 초기화 이후값 변경가능
		System.out.println("AGE: "+AGE); //상수 초기화 이후 값 변경불가능
		
		age=30;
//		AGE =20;//에러발생, 상수값은 초기화이후 변경하지 못함
	}
	
	public static void main(String[] args) {
		D_상수테스트 test = new D_상수테스트();
		test.testFinal();
	}

}
