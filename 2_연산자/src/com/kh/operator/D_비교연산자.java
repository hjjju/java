package com.kh.operator;

public class D_비교연산자 {
	public void opTest() {
		int a = 10 , b = 20 ;
		boolean result1 ,result2,result3; //노란색은 warning
		
		result1 = ( a== b);
		result2 = (a < b);
		result3 = (a > b);
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		
		
	}

	public static void main(String[] args) {
		new D_비교연산자().opTest();
	}

}
