package com.iu.s1;

public class Test6 {
	
	public static void main(String [] args) {
		System.out.println("== test6 start ==");
		
		// 5 int
		// 3.12 double
		// 5+3.12
		int num=5;
		double num2 = 3.12;
		//num = num+(int)num2;
		num = (int)(num+num2);
		System.out.println("Num : " + num);
		
		//국영수 - 0~100점 int
		int kor = 63;
		int eng = 35;
		int math = 53;
		// 총점을 계산해서 총점 출력
		int total = kor+eng+math;
		System.out.println("Total : " + total);
		// 평균을 계산해서 평균 출력
		// double avg = total/3; 값이 50.0 이유 : 
		/*  >> 나눈 값이 50.3333...이 나왔으나 total의 데이터타입은 int이기 때문에 50이 되었고 
		그 상태에서 double 데이터 타입이 적용되어 50.0 출력
		*/
		// 해결방법 : total의 데이터타입을 double로 형변환하여 계산
		//double avg = (double)total / 3; // 둘 중 하나에 double이 있으면 된다.
		double avg = total / 3.0;
		System.out.println("Avg : " + avg);
		
		double num3 = 5.124;
		int result = (int)num3;
		System.out.println(result);
	}
}
