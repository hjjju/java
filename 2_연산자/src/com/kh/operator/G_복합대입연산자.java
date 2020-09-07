package com.kh.operator;

public class G_복합대입연산자 {
	
	
	public void opTest() {
		//다른 연산자와 대입 연산자를 함께 사용하는 연산자를 말함
		//산술 대입 연산자 : +=, -=, *=, /=, %=
		
//		int result , num = 12; //따로 선언하는것이 권장사항
		
		
		int num = 12;
		System.out.println("num : " + num);
		
		num = num +3;
		
		System.out.println("num : " + num);
		
		
		//연산 수행속도가 더 빠르기 때문에 권장되는 방식임
		num +=3;
		System.out.println("num : " + num);
		
		num -= 5;
		System.out.println("num : " + num);
		
		num *= 2;
		System.out.println("num : " + num);
		
		num /= 2;
		System.out.println("num : " + num);
		
		
	}

	public static void main(String[] args) {
		 new G_복합대입연산자().opTest();
	}

}
