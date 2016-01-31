/*
 *  Napisati metodu koja vraća datum i trenutačno vrijeme.
 */
package zadaci_30_01_2016;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Zad4_TacanDatumIVrijeme {
	
	public static void main(String[] args) {
		// Prikazuje trenutni datum i vrijeme.
		System.out.println("Datum i vrijeme: " + dateTime());
		
	}
	// Metoda koja vraca string u obliku datum i vrijeme.
	public static String dateTime(){
		// Odredjujemo format prikaza datuma i vremena.
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		//Kreiramo instancu kalendara.
		Calendar cal = Calendar.getInstance();
		// Vracamo formatirani datum i vrijeme.
		return dateFormat.format(cal.getTime());
	}

}
