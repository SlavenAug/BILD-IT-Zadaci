/*
 * Ako pozovemo metodu System.currentTimeMillis()
 * dobijemo broj milisekundi od 1. januara 1970 do trenutka
 * pozivanja metode. Napisati program koji ispisuje trenutačni
 * datum i vrijeme u formatu
 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 */
package zadaci_25_01_2016;

import java.util.Calendar;

public class Zad3_DatumIVrijeme {
	
	public static void main(String[] args) {
		// Uzimamo trenutno vrijeme u milisekundama.
		long millis = System.currentTimeMillis();
		// Postavljamo vremensku zonu.
		final int timeZone = 1;
		// Ispisujemo tacan datum i vrijeme.
		System.out.println("Current date and time is: " + getDate(millis) + getTime(millis, timeZone));
		
		
	}
	
	public static String getTime(long millis, int timeZone){
	
		// Pretvara milisekunde u sekunde.
		long sekunde = millis / 1000;
		// Racuna sekunde.
		long seconds = sekunde % 60;
		long minute = sekunde / 60;
		// Racuna minute.
		long minutes = minute % 60;
		long sati = minute / 60;
		// Racuna sate.
		long hours = sati % 24;
		// Ispisuje tacno vrijeme.
		return (timeZone + hours) + ":" + minutes + ":" + seconds;
	}
	
	
	public static String month (int month){
		// Mjeseci u godini od 0 do 11.
		String [] months = {"Jan" , "Feb" , "Mar", "Apr", "May", "Jun",
				                 "Jul", "Avg", "Sep", "Oct", "Nov", "Dec"};
		
		return months[month];
		
	}
	
	
	public static String getDate (long millis){
		// Kreiranje kalendar objekta.
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		// Dobijamo godinu.
		int year = calendar.get(Calendar.YEAR);
		// Dobijamo mjesec.
		int month = calendar.get(Calendar.MONTH);
		// Dobijamo dan.
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		return day + ". " + month(month) + ", " + year + " ";
		
	}

}
