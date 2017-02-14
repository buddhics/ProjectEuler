package q19;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CountSundays {
	public static void main(String[] args) {
		CountSundays countSundays = new CountSundays();
		countSundays.count();
	}
	
	public void count(){
		int sundays = 0;
		for (int year = 1901; year <= 2000; year++) {
		    for (int month = 1; month <= 12; month++) {
		        if (LocalDate.of(year, month, 1).getDayOfWeek() == DayOfWeek.SUNDAY) {
		            sundays++;
		        }
		    }
		}
		System.out.println(sundays);
	}
}
