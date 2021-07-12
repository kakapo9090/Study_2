package com.iu.s1;

public class Test7 {

	public static void main(String [] args) {
		System.out.println("=== Test7 Start ===");
		int kor = 56;
		int eng = 65;
		int math = 49;
		int total = kor+eng+math;
		double avg = total / 3.0;
		
		System.out.println("Total : " + total); //170
		System.out.println("Avg : " + avg); //56.666666666666664

		//복습필요! 소숫점 두자리까지 표시하기
		avg = avg*100;
		System.out.println(avg);
		int result = (int)avg;
		System.out.println(result);
		avg = result/100.0;
		
		kor = 100;
		System.out.println("Total : " + total);
		System.out.println("Avg : " + avg); //56.66
		
		
		
	}
	
}
