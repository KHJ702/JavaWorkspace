package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	
	public boolean isLeapYear (int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
						
	}

	public long leapDate(Calendar c) {
		
		// 1년부터 2024년까지의 평일수 구하기.
		long total = 0;
		for(int i = 1; i < c.get(Calendar.YEAR)-1; i++) { // 올해는 뺴서 -1로 함
			total += 365;
			if(isLeapYear(i)) {
				total += 1;
			}
		}
		// 현재년도에서의 일수 구하기.
		int month = c.get(Calendar.MONTH) + 1;
		
		// 1~4월
		for(int i = 1; i < month; i++) {
		switch(i) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			total+=31;
			break;
		case 4,6,9,11:
			total+=30;
			break;
		case 2 : 
			total += (isLeapYear(c.get(Calendar.YEAR)) ? 29 : 28 );
		}
	  }
		
		// 이번달 일수 더하기
		total += c.get(Calendar.DATE); //5월 7일 -> +7;
		
		return total;
	}
}
