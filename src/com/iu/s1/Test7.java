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
		System.out.println("Avg * 100 : "+ avg);
		int result = (int)avg; //강제형변환 double->int 후 변수에 값 대입
		System.out.println("소수자리 제거 값 : "+result);
		avg = result/100.0; /* int타입 result를 소수자리로 표기한 상수값으로 나눠
		double타입으로 자동형변환 시키고 원래 있던 변수 avg에 대입
		*/
		
		kor = 100;
		System.out.println("Total : " + total);
		System.out.println("Avg : " + avg); //56.66
		
		
		
	}
	
}
