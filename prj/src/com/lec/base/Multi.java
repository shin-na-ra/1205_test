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
		
		String str = "abcd";
		System.out.println(str.toUpperCase());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
	}

}
