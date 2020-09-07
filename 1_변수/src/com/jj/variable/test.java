package com.jj.variable;

import java.util.Scanner;

public class test {
	
	
	public void test1() {
		String stringValue1 = "TEST 1";
		String stringValue2 = "TEST 2";
		
		System.out.println("stringValue1: " +stringValue1.hashCode());
		System.out.println("stringValue2: "+ stringValue2.hashCode());
		
		stringValue1 = stringValue1 + stringValue2;
		System.out.println("stringValue1: "+ stringValue1.hashCode());
		
		//StringBuffer 클래스이용
		StringBuffer sb = new StringBuffer();
		
		System.out.println("sb: "+sb.hashCode());
		
		sb.append("TEST StringBuffer");
		System.out.println("sb: "+sb.hashCode());
		
		sb.append(" what?");
		
		
		
		System.out.println("sb: "+sb);
		
		
		System.out.println("sb: "+sb.hashCode());
		
	}
	
	public void con() {
		String a="asf";
		String b ="qwerq"	;
		String c ="123";
		String d = "1231";
		
		System.out.println("ahash"+a.hashCode());
		
		System.out.println(a.concat(b));
		
		System.out.println("a출력:"+a);
		
		a= a+b;
		System.out.println("a:" +a);
		System.out.println(a.hashCode());
		
		System.out.println("c: "+c.hashCode());
		System.out.println(c.concat(d));
		System.out.println((c.concat(d)).hashCode());
		System.out.println(c);
		
		
	}
	
	
	
	public void test2() {
		byte bnum =10;
		short snum =20;
		
//		System.out.println(bnum+snum);
		short sum =(short) (bnum+snum);
		System.out.println(sum);
	}

	public static void main(String[] args) {
//		new test().test1();
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");

		String str = sc.nextLine();
		
		int cnt = str.length(); //길이
		System.out.println(cnt);
		int i=0;
		
		String str2="";
		do {
//			str2+=str.charAt(i);
			str2=str2+str.charAt(i);
			
			if(i==cnt-1) {
				break;
			}
				str2+="-";
				i++;
		
		} while (i<cnt);
		
		System.out.println(str2);*/
		test t = new test();
		
//		t.con();
		t.test2();
	}

	
	
}
