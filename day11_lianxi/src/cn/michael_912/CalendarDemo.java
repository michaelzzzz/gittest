package cn.michael_912;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {

	public static void main(String[] args) {
		GregorianCalendar  gc = new GregorianCalendar ();
		int year = gc.get(Calendar.YEAR);
		System.out.println(year);
	}

}
