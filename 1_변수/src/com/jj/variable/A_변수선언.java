package com.jj.variable;

public class A_변수선언 {
	//com.jj.variable.A변수선언<= 이게 클래스의 fullName이다.
	//패키지가 다르면 같은 이름의 클래스도 만들 수 있다.
	//클래스의 이름은 패키지를 포함한 이름이기 때문이다.
	
	public void declareVariable() {
		//변수의 선언
		//자료형 변수명; <-선언
		
		//숫자형
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//실수형
		float fnum;
		double dnum;
		
		//논리형
		boolean isTrue;
		
		//문자형
		char ch;
		
		//문자열
		String str;
		
		//변수 -6 start
		//변수에 값 대입후 출력
		//숫자만 대입하면 4byte보다 작거나 같은 값
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L; //형변환이 일어나서 뒤에 l을 붙이지 않아도 에러가 안난다.->공간이커서 상관없다
		
		fnum = 4.0f;
		dnum = 8.0;
		
		isTrue = true; //0,1은 안된다.. ㅎ true or false가능
		
		ch = 'A';
		str= "A";
		
		//변수에 지정된 값 출력하기
		System.out.println("bnum의 값: "+bnum);
		System.out.println("snum의 값: "+snum);
		System.out.println("inum의 값: "+inum);
		System.out.println("lnum의 값 : "+lnum);
		
		System.out.println("fnum의 값: "+fnum);
		System.out.println("dnum의 값: "+dnum);
		
		System.out.println("isTrue의 값: "+isTrue);
		
		System.out.println("ch의 값: "+ch);
		System.out.println("str의 값: "+str);
		}
		
	public static void main(String[] args) {
		A_변수선언 test = new A_변수선언();
		test.declareVariable();
		
	}

}
