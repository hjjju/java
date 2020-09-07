package com.kh.silsub1.example;

import java.util.Scanner;

public class silsub1 {
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~ 10 사이 정수 한개 입력: ");
		int n = sc.nextInt();
		
		if(n>= 1 && n<=10 ) {
			if(n%2 ==0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다.");
			}
		}else {
			System.out.println("1~10 사이의 정수를 입력해야합니다.");
		}
		
		
	}
	
	public void test2() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("키 입력: ");
		int hei = sc.nextInt();
		
		System.out.print("몸무게: ");
		int wei = sc.nextInt();
		
		double hei2 = (Math.round(hei/10));
		
		
		double bmi = wei / (hei2 * hei2);
		
		if(bmi >= 30) {
			System.out.println("비만");
		}else if (bmi >=25) {
			System.out.println("과체중");
			
		}else if(bmi>=20){
			System.out.println("정상체중");
		}else {
			System.out.println("저체중");
		}
		
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 입력: ");
		int n1 = sc.nextInt();
		System.out.print("첫번째 입력: ");
		int n2 = sc.nextInt();
		
		
		System.out.println("연산기호를 입력: (+,-,*,/,%");
//		char ch = sc.next().charAt(0);		
		sc.nextLine();
		char ch = sc.nextLine().charAt(0);
		
		if(ch =='+') {
			System.out.println(n1 +" + "+n2 + "= "+(n1+n2));
		}else if(ch =='-') {
			System.out.println(n1 +" - "+n2 + "= "+(n1-n2));
			
		}else if(ch =='*' ) {
			System.out.println(n1 +" * "+n2 + "= "+(n1*n2));
			
		}else if(ch =='/') {
			System.out.println(n1 +" / "+n2 + "= "+(n1/n2));
		}else if(ch =='%') {
			System.out.println(n1 +" % "+n2 + "= "+(n1%n2));
		}else {
			System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
		}
		
		
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사과, 바나나, 복숭아 키위 중하나를 입력하세요");
		
		String str = sc.nextLine();
		
		if("사과".equals(str)) {
			System.out.println("사과 : 1000원");
		}else if("바나나".equals(str)) {
			System.out.println("바나나 - 2000원");
		}else if("복숭아".equals(str)) {
			System.out.println("복숭아 - 2000원");
			
		}else if("키위".equals(str)) {
			System.out.println("키위 - 3000원");
		}else {
			System.out.println("입력한 과일은 없습니다.");
		}
		
	}
	
	public void test5() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int avg = (kor+math+eng)/3;
		
		if(avg<60) {
			System.out.println("평균점수 미달로 불합격입니다.");
		}else if(math <40 ) {
			System.out.println("수학점수 미달로 불합격입니다.");
		}else if(kor<40) {
			System.out.println("국어점수 미달로 불합격입니다.");
		}else if(eng<40) {
			System.out.println("영어점수 미달로 불합격입니다.");
		}else {
			System.out.println("합격입니다.");
		}
			
		
		
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급여 입력: ");
		int mSalary = sc.nextInt();
		sc.nextLine();
		
		System.out.print("매출액 입력: ");
		int cost = sc.nextInt();
		sc.nextLine();
		System.out.println("====================");
		System.out.println("매출액: "+cost);
		
		int bonus;
		if(cost>=50000000) {
			bonus = 5;
		}else if(cost >=30000000) {
			bonus = 3;
		}else if (cost >=10000000) {
			bonus =1;
			
		}else {
			bonus=0;
		}
		
		int bResult =(int) (cost * (bonus*0.01));
		
		
	
		System.out.println("보너스율: "+bonus+"%");
		System.out.println("월 급여: "+mSalary);
		System.out.println("보너스금액: " +bResult );
		System.out.println("====================");
		System.out.println("총급여: "  + (bResult+ mSalary));
		
		
		
	}
}
