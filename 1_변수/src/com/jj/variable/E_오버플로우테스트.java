package com.jj.variable;

public class E_오버플로우테스트 {
	public void printVarSize() {
		//변수의 사이즈
		System.out.println("byte의 크기: "+Byte.BYTES+"byte");
		System.out.println("short의 크기: "+Short.BYTES+"byte");
		System.out.println("int의 크기: "+Integer.BYTES+"byte");
		System.out.println("long의 크기: "+Long.BYTES+"byte");
		
		System.out.println("float의 크기: "+Float.BYTES+"byte");
		System.out.println("double의 크기: "+Double.BYTES+"byte");
		
		System.out.println("char의 크기: "+Character.BYTES+"byte");
		
		//Boolean은 BYTES를 제공하지 않는다.
	}
	
	public void testOverFlow() {
		//컵에물이 가득차 흘러넘치는 상태
		
//		byte bnum=128; //에러남, 범위를 벗아난 값임
		
		//계산 과정에서 범위를 벗어나면 오버플로우가 된다.
		//값이 순환됨 :  최대값127 +1 ->최소값 -128
		byte bnum = 127;
		bnum = (byte)(bnum + 1);  //1.바이트와 어떤숫자가 더해지던 결과는 int
		
		System.out.println("bnum: "+bnum);
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
//		int multi = num1 *  num2;
		
//		long multi = num1 * num2; //여전히 오버플로우발생 -> 저장하기전에 먼저 음수 나와서! 그값이 저장되었기 때문!
		
		//한 쪽의 자료형을 더 큰 자료형으로 변경하여 해결한다.
		long multi = (long) num1 * num2; 		//강제형 변환
		
		
		
		
		System.out.println("계산결과  : "+multi); //오버플로우 발생! , 논리에러 발생
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		E_오버플로우테스트 test = new E_오버플로우테스트();
//		test.printVarSize();
//		test.testOverFlow();
		test.calc();
		
	}

}
