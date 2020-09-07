package com.kh.chap02_loopingStatement;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class B_while {
	public void testWhile() {

		int i = 1;
		while (i <= 5) {
			System.out.println(i + "번째 반복문 수행중...");
			i++;
		}

	}

	public void testWhile2() {
		// 문자열을 입력받아서 인덱스별로 문자 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열입력: ");
		String str = sc.nextLine();

		int index = 0;
		while (index < str.length()) {
			char ch = str.charAt(index);
			System.out.println(index + ": " + ch);
			index++;
		}

	}

	public void testWhile3() {
		// 1부터 입력받은 수까지의 정수들의 합을 구하세요
		// 단 while문을 이용하세요

		int i = 1;

//		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력 : ");
//		int n = sc.nextInt();
		int n = new Scanner(System.in).nextInt();
		int sum = 0;
		while (i <= n) {
			sum += i;
			if(i != n) {
				System.out.print(i + " + ");
				
				
			}else {
				System.out.print(i +" = ");
			}
			
			
			i++;
		}
		System.out.println(sum);
	}
	
	
	public void testWhile4() {
		//while문을 이용해서 구구단을 2단부터 9단까지 출력
		
		int dan = 2;
//		int i = 1;
		
		
		while(dan<10) {
			int i = 1;
			while(i<10) {
				System.out.println(dan + " * " + i +" = " + (dan * i));
				i++;
			}
			System.out.println();
			dan++;
			
		}
	}

	
	public void testWhile5() {
		// 한줄에 별표 문자를 입력한줄 수 와 칸수만큼 출력
		// 단, 줄수와 칸수가 일치하느 ㄴ위체에서는 줄번호에대한정수가 출력
		/*
		 * 1**** 
		 * *2*** 
		 * **3** 
		 * ***4* 
		 * ****5
		 */
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("줄 입력: ");
		int row = sc.nextInt();

		System.out.print("칸 입력: ");
		int col = sc.nextInt();

		int i = 1;
		while (i <= row) {
			int j = 1;
			while (j <= col) {
				if (j == i) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
	}
}
