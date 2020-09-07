package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class C_ifElseIf {
	//if else if  구문은 다중조건을 줄 수 있는 문법이다.
	
	//[표현식] 
	//if(조건식1){
	// 조건1 일 참일떄 실행할 구문;
	//}else if(조건식2){
	// 조건2가 참일떄 실행할 구문;
	//}else{
	//위의 조건모두 거짓일떄 실행할 구문;
	//}
	
	
	public void testIfElseIf() {
		//점수를 하나 입력받아 등급을 나누어 점수와 등급을 출력하세요
		//등급은 90점 이상은 A등급
		//90점미만, 80점이상은 B등급
		//80점미만, 70점이상은 C등급
		//70점미만, 60점이상은 D등급
		//60점 미만은 F등급으로 나눈다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		char grade =' ';
	
		
		//if else if 구문은 위의 조건구문을 만족하지 못하고 내려왔기 떄문에
		//당연히 조건의 반대조건을 만족한다는 조건을 내부적으로 포함하고있다.
		if(point >=90) {
			grade = 'A';
		}else if(/*point <90 && */point >=80) { //위에서 90이상이 아니기떄문에 내려와서 해당 코드를 주석쳐도같은 의미
			grade = 'B';
		}else if(/*point<80 &&*/ grade>=70) {
			grade = 'C';
		}else if(/*point <70 &&*/ grade >=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는 %d이고 ,\n 등급은 %c입니다.",point,grade);
		
		//printf포맷
		//포맷문자와 값은 갯수와 자료형이 일치해야한다.
		//System.out.pritnf("%형식 ", 값(혹은 변수)); 의 형태로 사용한다.
		//->정해져있는 형식에 맞춰서 그형식에 맞는 값을 줄바꿈하지 않고 출력함
		
		//포맷문자
		// %d : 정수형
		// %f : 실수형
		// %c : 문자
		// %s : 문자열
		// %b : 논리형
		// %.2f : 소수점 아래 2자리까지만 표시
		
		//특수문자(escape 문자)
		// tap : \t
		// new line : \n
		// 역슬러쉬 : \\
		// 작은따옴표 : \'
		// 큰따옴표 : \"
		
		
	}
	
	public void testIfElseIf2() {
		//위 문제에 각등급별 중간 점수이상의 경우에는 
		//등급에 "+" 라는 문자를 추가하여 출력하세요
		//예 ) 95점이상은 등급이 "A+"로 출력되게 함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		String grade = "";
		
		
		if(point >=90) {
			grade = "A";
		}else if(/*point <90 && */point >=80) { //
			grade = "B";
		}else if(/*point<80 &&*/ point>=70) {
			grade = "C";
		}else if(/*point <70 &&*/ point >=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		
		String result = (point %10 ==0)? grade : grade+"+";
		
		System.out.println(result);
		
	}
	
	
	
}
