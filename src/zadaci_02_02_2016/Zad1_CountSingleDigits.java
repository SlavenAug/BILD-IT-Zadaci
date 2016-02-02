/*
 * Write a program that generates 100 random integers between
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */
package zadaci_02_02_2016;

public class Zad1_CountSingleDigits {
	
	public static void main(String[] args) {
		// Pozivamo metode i ispisujemo rezultat.
		printArray(array());
		
	}
	// Metoda generise niz brojeva.
	public static int[] array(){
		int[] count = new int[10];
		
		for (int i = 0; i < 100; i++){
			// Za svaki generisani broj uvecavamo index tog broja.
			count[(int)(Math.random() * 10)]++;
		}
		return count;
	}
	// Metoda ispisuje koliko se puta koji broj ponovio.
	public static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++){
			System.out.println("Number " + i + " has reppeted " + arr[i] + " times");
		}
	}

}
