package com.sec37.bushup2;


import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("unused")
public class dateDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		System.out.println(dt.getDate());
		Calendar cal = Calendar.getInstance();
//		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.AM_PM));
		
	

	}

}
