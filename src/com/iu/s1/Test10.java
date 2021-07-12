package com.iu.s1;

import java.util.Scanner;

public class Test10 {
	
	public static void main(String [] args) {
		System.out.println("=== Test10 Start ===");
		// 941223-1234567
		// 0    ->    0
		// 1    ->    1
		// 2    ->    2
		// 3    ->    3
		// 4    ->    10
		// 5    ->    11
		// 6    ->    12
		// 7    ->    13
		// 8    ->    20
		// 9    ->    21
		// 10   ->    22
		// 11   ->    23
		// 12   ->    30 
		// 13   ->    31
		// 14   ->    32
		// 15   ->    33
		// 16   ->    40
		// 17   ->    41
		//java는 필요할 때 변수 선언가능
		
		//실행 중에 데이터를 키보드로 부터 입력받을 준비 ctrl+space
		Scanner sc = new Scanner(System.in);
		
		
		int num=7;
		int result=0;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		result = num%4 + ((num/4)*10);
		System.out.println("input : " + num);
		System.out.println("output : " + result);
		
		//Github 사용하기
		
	}
}
