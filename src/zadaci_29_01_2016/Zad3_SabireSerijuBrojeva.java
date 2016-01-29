/*
 * Napisati program koji sabira sljedeću seriju
 * 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
 */
package zadaci_29_01_2016;

public class Zad3_SabireSerijuBrojeva {
	
	public static void main(String[] args) {
		double result = 0.0;
		
		for (double i = 1; i <= 97; i += 2){
			result += (i) / (i + 2);
		}
		System.out.println("Result is: " + result);
	}

}
