package com.lec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("test");
		System.out.println("test");
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		System.out.print("몇개의 숫자를 입력받을까? : ");
		num = sc.nextInt();
		
		for(int i = 1; i<= num; i++) {
			System.out.print(i+"의 숫자 : ");
			sum += sc.nextInt();
		}
		
		System.out.println("총합 : "+sum);
	}

}
