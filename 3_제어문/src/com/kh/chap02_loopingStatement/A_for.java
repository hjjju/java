package com.kh.chap02_loopingStatement;

import java.util.Scanner;

public class A_for {
	public void testFor() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력해 주세요 : ");
		String str = sc.nextLine();

		System.out.println("str : " + str);

		System.out.println("str.length() : " + str.length());

		for (int i = 0; i < str.length(); i++) {
//				System.out.println(i + "번째 반복문 수행중...");
			System.out.println("charAt(" + i + ") : " + str.charAt(i));
		}
	}

	public void testFor2() {
		// 정수를 하나 입력받아 그 수가 양수일떄만 그 수의 구구단을 출력하게하고,
		// 양수가 아니면 "반드시 1~9 사이의양수를 입력해야합니다. " 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("1~ 9까지의 양수를 하나입력하세요 :");
		int dan = sc.nextInt();

		if (/* dan >0 && */ dan >= 1 && dan <= 9) {

//				System.out.println(dan + "* 1 =" + dan*1);
//				System.out.println(dan + "* 2 =" + dan*2);
//				System.out.println(dan + "* 3 =" + dan*3);
//				System.out.println(dan + "* 4 =" + dan*4);
//				System.out.println(dan + "* 5 =" + dan*5);
//				System.out.println(dan + "* 6 =" + dan*6);
//				System.out.println(dan + "* 7 =" + dan*7);
//				System.out.println(dan + "* 8 =" + dan*8);
//				System.out.println(dan + "* 9 =" + dan*9);

			for (int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));

			}

		} else {
			System.out.println("1~9까지의 양수를 입력해야 합니다.");
		}

	}

	public void testFor3() {
		// 1부터 100사이의 임의의 난수까지의 정수들의 합계를 구하여 출력
		// 예 ) 난수가 5가 발생햇으면 1 + 2 + 3 + 4 + 5 =?? 결과출력

		int num = (int) (Math.random() * 100) + 1;
		System.out.println(num);
		int sum = 0;
		for (int i = 1; i < num + 1; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
	}

	// 4번어디갔냐

	public void testFor5() {
		// for문 안에서 for문을 사용할 수 있다.
		// 예 : 구구단 2단부터 9단까지

		// 2단부터 9단까지를 반복하는 for문
		for (int dan = 2; dan < 10; dan++) {
			for (int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println();
		}
	}

	public void testFor6() {
		for (int hour = 0; hour < 24; hour++) {
			for (int min = 0; min < 60; min++) {
				System.out.println(hour + "시" + min + "분");
			}
		}
	}

	public void testFor7() {
		// 별찍기
		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 줄 수 입력 : ");

		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			// 한줄에 '*' 문자 5개 출력
			for (int c = 1; c <= 5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void testFor8() {
		// 한줄에 별표 문자를 입력한줄 수 와 칸수만큼 출력
		// 단, 줄수와 칸수가 일치하느 ㄴ위체에서는 줄번호에대한정수가 출력
		/*
		 * 1**** 
		 * *2*** 
		 * **3** 
		 * ***4* 
		 * ****5
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 : ");
		int row = sc.nextInt();

		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= col; c++) {
				if (c ==r) {
					System.out.print(r);
				}else {
					System.out.print("*");
					
				}
			}
			System.out.println();
		}
		

	}
}
