/*
 * Napisati metodu koja printa 100 nasumicnih
 * uppercase karaktera i 100 nasumicnih
 * brojeva, 10 po liniji.
 */
package zadaci_18_01_2016;

public class Zad4_NasumicniBrojeviKarakteri {

	public static void nasumicno(){
		// Petlja za stampanje 100 nasumicnih uppercase karaktera
		// 10 po liniji.
		for (int i = 1; i <= 100; i++){
			System.out.printf("%3c", (int) (Math.random() * 26) + 65);
			if ( i % 10 == 0){
				System.out.println();
			}
		}
		// Petlja za stampanje 100 nasumicnih brojeva
		// 10 po liniji.
		for (int i = 1; i <= 100; i++){
			System.out.printf("%3d", (int) (Math.random() * 10));
			if ( i % 10 == 0){
				System.out.println();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// Pozivamo metodu.
		nasumicno();
	}
}
