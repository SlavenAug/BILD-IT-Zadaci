package zadaci_16_01_2016;
import methods.Unos;


public class Zad4_Matrica {
	
	public static void printMatrix(int n){
		// Kreiramo matricu.
		int [][] matrix = new int [n][n];
		// Unos nasumicnih vrijednosti matrice, 0 ili 1.
		for (int i = 0; i < matrix.length; i++){
			for (int k = 0; k < matrix[i].length; k++){
				int broj = (int)(Math.random() * 2);
				matrix[i][k] = broj;
			}
		}
		
		
		// Ispisujemo matricu
		for (int i = 0; i < matrix.length; i++){
			for (int k = 0; k < matrix[i].length; k++){
				System.out.print(matrix[i][k] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// Pita korisnika da unese duzinu matrice
		System.out.println("Unesite duzinu matrice:");
		/*
		 * Unos duzine matrice zasticen da ne bi 
		 * doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		int n = Unos.inputInt();
		
		// Pozivamo metodu koja kreira i printa matricu
		printMatrix(n);
		
		
	}

}
