package com.kh.silsub4.example;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	
	// 정수 한 개를 입력 받아, 1부터 입력 받은
//	정수까지의 짝수의 합을 출력하세요.
//	(for문 활용, 분기문 사용하지 않고 작성)
	
	
	public void test01() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하시오");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		
		System.out.println("sum: "+sum);
		
	}
	
	
	public void test02() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력: ");
		int n = sc.nextInt();
		int sum = 0;
		int i=1;
		while(i <=n) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		
		System.out.println("sum: "+sum);
	}
	
	public void test03() {
//		 정수를 입력 받아 1부터 입력 받은 정수까지
//		 수를 홀수와 짝수를 구분하여 홀수면 “수”
//		 짝수면 “박”, 를 반복하여 출력 하세요
		
		Scanner sc = new Scanner(System.in);
		
		String even = "박";
		String odd = "수";
		
		
		System.out.print("정수를 입력: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			if(i%2==0) {
				System.out.print(even);
			}else {
				System.out.print(odd);
			}
			
		}
		
	}
		
		
	public void test04() {
		Scanner sc= new Scanner(System.in);
		
			String order = "";
			int price =0;
			String con="" ;
		
		do {
			System.out.println("================Menu====================");
			System.out.println("1.상하이 스파이스 치킨버거 ---------5,500원");
			System.out.println("2.빅맥-------------------- ---------5,000원");
			System.out.println("3.베이컨토마토 디럭스------ ---------6,000원");
			System.out.println("================음료====================");
			System.out.println("4.콜라-------------------- ---------1,500원");
			System.out.println("5.사이다------------------- ---------1,500원");
			System.out.println("6.오렌지쥬스-------------- ---------2,000원");
			System.out.println("7.커피-------------------- ---------1,000원");
			System.out.println("================사이드===================");
			System.out.println("8.감자튀김------------- ---------700원");
			System.out.println("9.아이스크림------------ ---------1,000원");
			System.out.println("=========================================");
			
			
			System.out.print("주문하실 메뉴를 번호르 입력하세요: ");
			int ch = sc.nextInt();
			System.out.print("주문하실 수량을 입력하세요: ");
			int cnt = sc.nextInt();
			System.out.print("추가 주문 하시겠습니까?(y/n) :");
			con = sc.next();
			
			System.out.println();
			switch (ch) {
			case 1: order += "상하이 스파이스 치킨버거 " +cnt+"개 "+(cnt*5500)+"원\n" ;price+=(5500*cnt);break;
			case 2: order +=" 빅맥 " +cnt+"개 "+(cnt*5000)+"원\n"; price+=(5000*cnt);break;
			case 3: order +="베이컨토마토디럭스 "+cnt+"개 "+(cnt*6000*cnt)+"원\n"; price+=(6000*cnt);break;
			case 4: order +="콜라 "+cnt+"개 " +(cnt*1500) +"원\n"; price+=(cnt*1500);break;
			case 5: order +="사이다 "+cnt+"개 "+(cnt*1500)+"원\n";price+=(cnt*1500);break;
			case 6: order +="오렌지쥬스" +cnt+"개 " +(cnt*2000)+"원\n"; price+=(cnt*2000); break;
			case 7: order +="커피 " +cnt +"개 "+(cnt*1000)+ " 원\n"; price+=(cnt*1000); break;
			case 8: order +="감자튀김 " +cnt +"개 " +(cnt*700)+"원\n"; price+=(cnt*700); break;
			case 9: order +="아이스크림 " + cnt+"개\n" +(cnt*1000)+"원\n"; price+=(cnt*1000); break;
				

			}
			
			if(con.toUpperCase().equals("N")) {
				break;
			}
			
		} while (true);
		
		System.out.println("===========================");
		System.out.println(order);
		System.out.println("==========================");
		System.out.println("total price: "+price);
	}
	
	
	public void test5() {
		
//		1~100 사이의 임의의 난수를 발생시키고, 정수
//		한 개를 입력 받아, 난수가 입력 받은 정수보다
//		작으면 “입력하신 정수보다 작습니다.” 출력,
//		난수가 입력 받은 정수보다 크면 “입력하신
//		정수보다 큽니다.” 출력하세요.
//		단, 정답을 맞출 때까지 정수를 계속 입력 받아
//		프로그램이 반복되도록 하고, 정답인 경우
//		“정답입니다. 5회 만에 정답을 맞추셨습니다.”와
//		같이 몇 회 만에 정답을 맞추었는지 출력하도록
//		작성하세요.
		
		Scanner sc = new Scanner(System.in);
		int n =(int)( Math.random()*100 )+1 ;
		int cnt =0;
		System.out.println(n);
		do {
			System.out.print("정수를 하나 맞춰보세요: ");
			int num = sc.nextInt();
			
			if(num !=n) {
				cnt++;
			}
			else {
				cnt ++;
				break;
			}
			
			
			
		} while (true); 
		
		System.out.println("정답입니다. " +cnt+"회 만에 정답을 맞추셨습니다.");
	}	
		
	
	
}
