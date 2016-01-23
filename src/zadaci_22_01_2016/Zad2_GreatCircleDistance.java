/*
 *  Zadatak 2: Great circle distance predstavlja udaljenost
 * između dvije tačke na površini sfere. Neka nam (x1, y1) i (x2, y2)
 * predstavljaju geografsku širinu i dužinu dvije tačke. Great
 * circle distance između ove dvije tačke može biti izračunata
 * koristeći se sljedećom formulom:
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
 * Napisati program koij pita korisnika da unese geografsku širinu i
 * dužinu u stepenima dvije tačke na površini zemlje te mu ispisuje
 * great circle distance. Prosječni radius zemlje je 6.371.01 km.
 * Stepene koje korisnik unese trebamo promijeniti u radianse
 * koristeći se Math.toRadians metodom jer Java trigonometrijske
 * metode koriste radianse. Širina i dužina u ovoj formuli se odnose
 * na zapad i sjever. Koristimo negativne vrijednosti da označimo istok i jug. 
 */
package zadaci_22_01_2016;

import methods.Unos;

public class Zad2_GreatCircleDistance {
	
	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite geografsku sirinu u stepenima:");
		double x1 = Unos.inputDouble();
		System.out.println("Unesite geografsku duzinu u stepenima");
		double y1 = Unos.inputDouble();
		System.out.println("Unesite geografsku sirinu u stepenima:");
		double x2 = Unos.inputDouble();
		System.out.println("Unesite geografsku duzinu u stepenima");
		double y2 = Unos.inputDouble();
		// Pozivamo metodu i stampamo rezultat.
		System.out.println("Great Circle Distance is : " + distanca(x1, y1, x2, y2));
		
	}

	   public static double distanca (double x1, double y1, double x2, double y2){
		   // Radius zemlje.
	       final double radius = 6371.01;
	       // formula za racunanje udaljenosti izmedju dvije tacke.
		   return (Math.acos(Math.sin(Math.toRadians(x1)) 
				   * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) 
				   * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)))) * radius;
	   }
		


}

