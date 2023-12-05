package com.lec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("test");
		System.out.println("test");
		
		int total = 0;
		int number = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<= number; i++) {
			System.out.print(i+"의 숫자 : ");
			total += sc.nextInt();
		}
		
		for(int i = 1; i<= number; i++) {
			System.out.print(i+"의 숫자 : ");
			total += sc.nextInt();
		}
		
		System.out.println("총합 : "+total);
	}

}
