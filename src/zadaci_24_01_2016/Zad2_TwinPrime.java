/*
 * 
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2.
 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su
 * također twin primes. Napisati program koji ispisuje sve twin prime
 * brojeve manje od 10000, 10 parova po liniji. 
 */
package zadaci_24_01_2016;

public class Zad2_TwinPrime {
	
	public static void main(String[] args) {
		
		final int limit = 10000;
		int brojac = 0;
		// Petlja koja ispisuje rezultat.
		for (int i = 3; i < limit; i++){
			// Provjerava da li su dva broja twin prime.
			if (isPrime(i) && isPrime(i + 2)){
				// Ispisuje 10 parova po liniji.
				System.out.print(brojac % 10 == 0 ? "\n " + i + " i " +(i + 2) + "; " : i + " i " + ( i + 2) + "; ");
				// Uvecava brojac.
				brojac++;
			}
			
		}
		
	}
	
	// Metoda koja pronalazi prime brojeve.
	public static boolean isPrime(int broj){
		// Ako je broj djeljiv sa prethodnim brojevima
		// onda nije prost.
		for (int i = 2; i < broj; i++){
			if (broj % i == 0){
				return false;
			}
		}
		return true;
	}

}
