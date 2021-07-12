package com.iu.s1;

public class Test8 {

		public static void main(String [] args) {
			System.out.println("=== Test8 Start===");
			
			//물건값의 합계
			int price;
			//손님이 낸 돈
			int money;
			//거스름돈
			int don;
			
			price = 25480;
			money = 50000;
			don = money-price;
			
			// 조건: 물건값의 합계 < 손님이 낸 돈
			// (1)물건값의 합계, 손님이 낸 돈, 거스름돈을 각각 출력
			
			System.out.println("물건값의 합계 : " + price);
			System.out.println("손님이 낸 돈 : " + money);
			System.out.println("거스름돈 : " + don);
			
			//만원짜리 갯수를 담을 변수
			int man;
			//천원짜리 갯수를 담을 변수
			int cheon;
			//백원짜리 갯수를 담을 변수
			int back;
			//십원짜리 갯수를 담을 변수
			int sip;
			
			//만원 ??장, 천원 ??장, 백원 ??개, 십원 ??개 출력
			man = don/10000;		
			System.out.println("만원 : " + man + " 장");
			
			cheon = (don-(man*10000)) / 1000;		
			System.out.println("천원 : " + cheon + " 장");
			
			back = (don-(man*10000)-(cheon*1000)) / 100;		
			System.out.println("백원 : " + back + " 개");
			
			sip = (don-(man*10000)-(cheon*1000)-(back*100)) / 10;		
			System.out.println("십원 : " + sip + " 개");
			
			
			//나머지 연산자 %를 사용해서 계산하기
			cheon = don % 10000 / 1000;
			System.out.println(cheon);
			back = don % 1000 / 100;
			System.out.println(back);
			sip = don % 100 / 10;
			System.out.println(sip);
		}
}
