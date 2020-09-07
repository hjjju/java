package com.kh.array;

public class A_array {
	public void testArray() {
		// 배열의 사용 이유
		// 배열을 사용하지 않으면 변수를 여러 개 사용해야 한다.

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;

		int sum = 0;

		/*
		 * sum += num1; sum += num2; sum += num3; sum += num4; sum += num5;
		 */

		// 변수의 이름을 변경하여 반복문을 사용할 수 없다.
//		for(int i =1; i<=5 ; i++) {
//			sum+= num +i;
//		}

		int[] arr = new int[5];

//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;

		for (int i = 0, value = 0; i < 5; i++) {
			arr[i] = value += 10;
		}

		int sum2 = 0;

//		sum2 += arr[0];
//		sum2 += arr[1];
//		sum2 += arr[2];
//		sum2 += arr[3];
//		sum2 += arr[4];

		for (int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}

	}

	public void testArraye2() {
		// 배열을 사용하는 방법
		// 배열의 선언
		// 자료형[] 변수명;
		// 자료형 변수명[];

		// 선언은 stack 에 배열의주소를 보관할 수 있는 공간을 만드는 것이다.
		int[] iarr;
		char carr[];

		// 선언한 레퍼런스 변수에 배열을 할당한 주소를 대입해서 사용한다.
		// new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
		// 발생한 주소를 레퍼런스 변수에 저장하고 이것을 참조하여 사용하기 떄문에 참조자료형 이라고한다.

		// String도 이것과 비슷

		// 배열을 할당할 시에는 반드시 배열의크기를 양수로 지정해 주어야한다.
//		iarr = new int[]; //크기를 지정해 주지 않아서 에러발생함
		iarr = new int[5];
		carr = new char[10];

		// 배열은 선언과 할당을 동시에 할 수도 있다.
//		int[] iarr2 = new int[5];
//		char[] carr2 = new char[10];

		System.out.println("iarr: " + iarr);
		System.out.println("carr: " + carr); // 16진수로 출력됨 ,배열이 있는 시작위치의 주소

		System.out.println("iarr의 hashcode: " + iarr.hashCode()); //16진수 주소를 10진수로 반환해서 리턴해주는 함수(hashcode) 
		System.out.println("carr의 ahshcode: " + carr.hashCode());

	}
}
