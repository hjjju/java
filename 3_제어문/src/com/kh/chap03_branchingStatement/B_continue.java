package com.kh.chap03_branchingStatement;

public class B_continue {
	// continue문 : 반복문 내에서만 사용할수 있음
	// if(조건식) continue;
	// continue 문 아래를 실행하지 않고 증감식으로 건너뛰라는 의미임

	// 1~100까지의 정수들의 합계 출력
	// 단, 4의 배수는 빼고 계산

	public void testContinue() {
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
				continue;
			}
			System.out.println("더해진 값: " + i);
			sum += i;
		}
		System.out.println("sum: " + sum);
	}

	
	
	
	public void testContinue2() {
		
		for(int dan = 2; dan<10;dan++) {
			for(int su =1; su<10; su++) {
				if(dan % 2== 0 || su %2 ==0) {
					continue;
				}
				System.out.println(dan +" * " + su + " = " + (dan * su));
			}
			System.out.println();
		}
	}
}
