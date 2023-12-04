package com.lec.base;

import java.util.Calendar;

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
	}

}
