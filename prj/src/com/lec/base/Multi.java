package com.lec.base;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {

		for(int i=1; i <= 9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.println(j+"X"+i+"="+j*i);
			}
		}
		
		System.out.println("task1 : i workked it!");
		System.out.println("test1 : i don't wanna work..s");
		System.out.println("test1 : but i have to work");

		
		String str1 = "ABCD";
		System.out.println(str1.toLowerCase());
		String str2 = "abcd";
		System.out.println(str2.toUpperCase());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		System.out.println("입력한 숫자 : "+inputNum);
		
		int[] arr = new int[6];
		Random random = new Random();
		int input = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			input = random.nextInt(45)+1;
			arr[i] = input;
			
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		int num1 = 123;
		String str = "12345";
		
		System.out.println(str1.concat(Integer.toString(num1)));
	}

}
