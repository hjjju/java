package com.jj.variable;

public class F_형변환테스트 {
	//(바꿀자료형)값 또는 (바꿀자료형)변수
	//cast 연산자 : 자료형을 변경할때 사용하는 연산자
	//형변환: 자동(묵시적)형변환, 강제(명시적)형변환이 있다.
	
	//자동 형변환 규칙
	//1. 더 큰 자료형으로 자동 형변환 가능하다.
	//2. 정수가 실수로 자동 형 변환 가능하다.
	//3. char -> int 로 자동형 변환 가능하다.
	
	
	//자동형 변환 예외규칙
	//1. boolean은 형변환 규칙에서 제외된다.
	//2. byte 혹은 short 자료형의 연산은 int가 된다.
	
	
	public void mehtod1() {
//		boolean 자료형은 형변환에서 제외되는 자료형 이다.(강제형변환도 안됨)
//		boolean flag = (booelan)1;
		
		int num ='A';
		System.out.println("num: " + num);
		
		char ch = 97; //단지 97이라는것은 정수형태의 리터럴일뿐
		System.out.println("ch :" + ch);
//		char ch2 = -97; //에러남
		
		char ch2 = (char) num;  //형변환연산자를 쓰고 공백문자를 (space)를 넣어준다. 규칙
		System.out.println("ch2: " + ch2);
		
		int num2 = -97;
		char ch3 = (char) num2;
		System.out.println("ch3 : " + ch3);
		
	}
	
	
	public void mehtod2() {
		//다른 자료형 끼리의 연산
		int inum = 10;
		long lnum = 100; //자동 형변환 일어남
		
		//방법1. 수행 결과를 int로 강제 형변환 한다.
		int isum = (int)( inum + lnum);
		System.out.println("isum : " + isum);
		
		//방법2. long 자료형 값을 int로 강제 형변환한다.
		int isum2 = inum + (int) lnum;
		System.out.println("isum2: "+ isum2);
		
		//방법3. long 자료형으로 결과 값을 받아준다.
		long isum3  = inum + lnum;
		System.out.println("isum3: " + isum3);
		
		//byte와 short의 연산결과는 무조건 int가 된다
		byte bnum = 1;
		short snum = 2 ;
		
		//방법1. 계산 결과를 short으로 강제 형 변환한다. 
		short sum = (short) (bnum + snum);
		
		//방법2. int형으로 계산 결과 나올것을 예상하여 결과를 담을 변수를 int형으로 선언한다.
		int sum2 = bnum + snum;
		
		
	}
	
	
	public void mehtod3() {
		//정수는 실수로 자동 형변환이 된다.
		long lnum  = 100;
		
		float fnum = lnum;
		
		
		System.out.println("fnum : " + fnum);
		
		//실수는 정수로 변경 할때 강제 형변환을 해야한다.
		double dnum = 10.5;
		
		long lnum2 = (long) dnum;
		
		System.out.println("lnum2: " + lnum2);
	
	}
	
	public void testDataloss() {
		//데이터 손실 테스트
		int inum = 290;
		System.out.println("inum : " + inum);
		
		//계산 하기 쉽지 않기 떄문에
		//의도하지 않은 데이터 손실이 일어 날 수있으니 유의해서 사용해야 한다.
		byte bnum = (byte) inum;
		
		System.out.println("bnum : " + bnum);
		
	}
	
	public static void main(String[] args) {
		F_형변환테스트 test =  new F_형변환테스트();
//		test.mehtod1();
//		test.mehtod2();
//		test.mehtod3();
		test.testDataloss();
	}

}
