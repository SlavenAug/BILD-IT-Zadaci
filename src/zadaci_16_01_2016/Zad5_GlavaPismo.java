package zadaci_16_01_2016;

import methods.Unos;

public class Zad5_GlavaPismo {

	public static void glavaPismo(int n){
		
		// Brojaci za glavu i pismo.
		int glava = 0;
		int pismo = 0;
		
		// Petlja koja racuna koliko je puta pala glava ili pismo.
	    for(int i = 0; i < n; i++){
	    	// Kreiramo novcic, 0 za pismo, 1 za glavu.
	    	int novcic = (int) (Math.random() * 2);
	    	if (novcic == 0){
	    		pismo++;
	    	} else{
	    		glava++;
	    	}
	    }
	    
	    // Ispisuje koliko je puta pala glava a koliko pismo.
	    System.out.println("Glava je bila " + glava + " puta:");
	    System.out.println("Pismo je bilo " + pismo + " puta:");
	}
	
	
	public static void main(String[] args) {
		/*
		 * Unos zasticen da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite koliko puta da se baci novcic: ");
		int bacanje = Unos.inputInt();
		// Pozivamo metodu 
		glavaPismo(bacanje);
	}
}
