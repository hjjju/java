package com.kh.silsub3.example;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ForWhile {
	Scanner sc = new Scanner(System.in);

	
	public void printStar1() {
		System.out.print("정수 하나 입력: ");
		int n = sc.nextInt();
		
		if(n>0) {
			for(int i =1 ; i<=n; i++	) {
				for(int j =1; j<=n; j++) {
					if(i==j) {
						System.out.print(i);
						break;
					}
				}
				System.out.println();
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
		
	}
	
	public void printStar2() {
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		if(n>0) {
			for( int i =0; i<n ;i++	) {
				for(int j = 0; j<n ; j++) {
					if(i==j) {
						System.out.print("*");
						break;
					}
					System.out.print("*");
				}
				System.out.println();
			}
			
		}else if(n<0) {
			
			for(int i=0; i< Math.abs(n); i++) {
				for(int j = Math.abs(n); j>0; j--) {
					if(i==j) {
						break;
					}
					System.out.print("*");
				}
				
				System.out.println();
			}
			
			
		}else {
			System.out.println("출력기능이 없습니다.");
		}
		
		
	}
	
	public void selectMenu() {
		int no;
		int price=0;
		int cnt =0;
		String order ="";
		char ch=' ';
		do {
			
			System.out.println("*** 메뉴를 선택하세요 ***");
			System.out.println("햄버거 ***************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	3200원");
			System.out.println("추가 ****************");
			System.out.println("3. 감자튀김	1000원");
			System.out.println("4. 치즈스틱	400원");
			System.out.println("5. 샐러드	2000원");
			System.out.println("음료수 ***************");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드	1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("********************");
			
			System.out.print("메뉴 선택: ");
			no = sc.nextInt();
			sc.nextLine();
			System.out.print("수량: ");
			cnt = sc.nextInt();
			System.out.println(cnt+"개 주문하셨습니다.");
			sc.nextLine();
			switch(no) {
			case 1: order+="불고기버거:"+cnt+"개" +(cnt*3500)+"원\n"; price+=(3500*cnt); break;
			case 2:	order +="치킨버거: "+cnt+"개" +(cnt*3200)+"원\n"; price+=(3200);break;
			case 3: order +="감자튀김: "+cnt+"개" +(cnt*1000)+"원\n"; price+=(1000*cnt);break;
			case 4: order +="치즈스틱: "+cnt+"개" +(cnt*400)+"원\n"; price+=(400*cnt);break;
			case 5: order +="샐러드: "+cnt+"개" +(cnt*200)+"원\n"; price+=(200*cnt);break;
			case 6:	order +="콜라: " +cnt+"개" +(cnt*700)+"원\n"; price+=(700*cnt);break;
			case 7: order +="에이드: " +cnt+"개" +(cnt*1200)+"원\n"; price+=(1200*cnt);break;
			case 8: order +="커피: " +cnt+"개" +(cnt*1000)+"원\n"; price+=(1000*cnt);break;
			
			
			}
			
			System.out.print("추가 주문하시겠습니까?(y/n) ");
			
			ch = sc.next().toUpperCase().charAt(0);
			 
			if(ch !='Y') {
				break;
			}
			
			
		} while (true);
		
		System.out.println("* 주문하신 정보는 다음과 같습니다. *");
		System.out.println("-----------------------------------------------");
		System.out.println(order);
		System.out.println("-----------------------------------------------");
		System.out.println("총 가격: "+price+"원");
		
	}
	
	
	
	
	public void countInput() {
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		sc.nextLine();
		
		System.out.print("문자 하나 입력: ");
		char ch = sc.next().charAt(0);
		
		sc.nextLine();
		
		int cnt =0;
		
		
		
		
		for(int i =0; i<str.length();i++) {
			if(ch == str.charAt(i)) {
				cnt ++;
			}
		}
		
		
		System.out.println("포함된 개수: "+cnt+"개");
	}

	public void test() {

		char a = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a);
				a++;

			}
			System.out.println();
		}

	}

	
	
	
}
	
