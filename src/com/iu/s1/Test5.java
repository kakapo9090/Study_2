package com.iu.s1;

public class Test5 {
	
	public static void main(String [] args) {
		System.out.println("=== Test5 Start ===");
		int num=5;
		num= num+1;
		//int num=3; 오류(중복선언): 노션 변수글 참고
		//변수명이 메모리주소를 대신함
		
		
		int num1 = 3;
		long num2 = 9L;
		
		System.out.println(num1);
		
		num1 = (int)num2;
		
		System.out.println(num1);
		
		num1=3;
		//num2 = (long)num1;
		num2 = num1;
		System.out.println(num2);
		
		char ch = 'a';
		int num3 = ch; //자동형변환 (int)생략
		System.out.println("num3 : "+num3);
		//아스키 코드표 참고
		ch = (char)(num3+25);//z
		System.out.println("ch : " + ch);
		
		//표현할 수 있는 숫자가 많은쪽이 큰것(특히 소수)
		//double>float>long>int>short,char>byte
		long num4 = 10L;
		float f1 = num4;
		
	}

}
