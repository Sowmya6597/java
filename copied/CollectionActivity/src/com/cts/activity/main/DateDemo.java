package com.cts.activity.main;

import java.util.Date;

public class DateDemo {
	public static void main(String args[]) {
		Date date=new Date();
		System.out.println(date);
		int day=date.getDay();
		switch(day)
		{
		case 0:System.out.println("Sunday");
		break;
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tue");
		break;
		case 3:System.out.println("wed");
		break;
		case 4:System.out.println("thrus");
		break;
		case 5:System.out.println("Fridsy");
		break;
		case 6:System.out.println("Sat");
		break;
		}
	}
}
