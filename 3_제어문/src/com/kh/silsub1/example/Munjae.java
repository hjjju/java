package com.kh.silsub1.example;

import java.util.Scanner;

public class Munjae {
	//실습2
	
		//국, 영, 수 세 과목(int)의 점수를 키보드로 입력받고,
		//합계와 평균을 계산하고,
		//세 과목의 점수와 평균을 가지고 합격 여부 처리함
		//합격의 조건 : 세 과목의 점수가 각각 40점이상이고,
		//			평균이 60점 이상이면 합격, 
		//			아니면 불합격 처리함
		//합격인 경우에는 과목별 점수와 합계, 평균을 출력하고,
		//불합격인 경우는 "불합격" 출력함
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 입력");
		int kor = sc.nextInt();
		System.out.print("영어 입력");
		int eng = sc.nextInt();
		System.out.print("수학 입력");
		int math = sc.nextInt();
		
		double avg =( math+ eng+ kor)/3;
		int sum = math+ eng + kor;
		
		
		
		if(avg< 60 || (math<40 | eng <40 || kor <40)) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}
		
		
	}
	
	
	
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 초기메뉴");
		System.out.println(" 1. 입력");
		System.out.println(" 2. 수정");
		System.out.println(" 3. 조회");
		System.out.println(" 4. 삭제");
		System.out.println(" 7. 종료");
		System.out.print("메뉴 번호 입력: ");
		
		int ch = sc.nextInt();
		
		
		switch(ch) {
		case 1: System.out.println("입력메뉴가 선택되었습니다."); break;
		case 2: System.out.println("수정메뉴가 선택되었습니다."); break;
		case 3: System.out.println("조회메뉴가 선택되었습니다."); break;
		case 4: System.out.println("삭제메뉴가 선택되었습니다."); break;
		case 7: System.out.println("프로그램이 종료 됩니다."); break;
		default: System.out.println("번호가 잘못 입력되었습니다. 다시 입력하십시오"); return;
		
		
		}
	}
	
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수하나 입력: ");
		int n  = sc.nextInt();
		
		if(n >0){
			System.err.println("양수다");
		}else {
			System.out.println("양수가 아니다.");
		}
		
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int n = sc.nextInt();
		
		String str="";
		
		if(n>0) {
			if(n%2 ==0) {
				str="짝수다.";
				System.out.println(str);
			}else {
				str="홀수다";
				System.out.println(str);
			}
		}else {
			System.out.println("0보다 큰수 여야합니다.");
		}
				
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:  ");
		String name = sc.nextLine();
		System.out.print("나이:  ");
		int age = sc.nextInt();
		System.out.print("키:   ");
		double height = sc.nextDouble();
		
		if(!name.equals(null) && name.length() >=0 && age>0 && height >=0) {
			System.out.println("확인: "+name+"  의  나이는 "+age+"세이고 키는 "+height+" cm 이다.");
		}
		
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수");
		int n2 = sc.nextInt();
		
		if(n1 >=0 && n2 >=0) {
			System.out.println(n1+ " + " + n2 +"  = "  + (n1+n2));
			System.out.println(n1+ " - " + n2 +"  = " + (n1-n2));
			System.out.println(n1+ " * " + n2 +"  = " + (n1*n2));
			System.out.println(n1+ " / " + n2 +"  = " + (n1/n2));
			System.out.println(n1+ " % " + n2 +"  = " + (n1%n2));
		}
				
				
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		char ch = ' ';
		if(score>0) {
			if(score>=90) {
				ch = 'A';
			}else if(score >= 80) {
				ch ='B';
			}else if(score >= 70) {
				ch ='C';
			}else if(score >=60) {
				ch ='D';
			}else {
				ch = 'F';
			}
				
			
		}else {
			System.out.println("0보다큰 수를 입력해야합니다.");
		}
		System.out.println("점수 : " +score + "  학점:  " + ch);
		
	}

}
