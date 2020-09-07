package com.kh.chap03_branchingStatement;

public class C_jumpBreak {
	public void testJumpBreak() {
		
		
		label:
		for(;;) {
			for(int i= 0; i<10 ; i++) {
				System.out.println(i);
				
				if(i ==3) {
					break label;
				}
			}
		}
	}
}
