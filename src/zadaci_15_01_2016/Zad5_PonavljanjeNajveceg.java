package zadaci_15_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad5_PonavljanjeNajveceg {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// Postavljamo uslov petlje.
		int prekid = 1;
		// Kreiramo varijablu koju cemo koristiti 
		// za spremanje najveceg broja.
		int max = 0;
		// Kreiramo brojac koji cemo koristiti
		// za spremanje koliko se puta
		// najveci broj ponovio.
		int brojac = 0;
		// Kreiramo listu.
		ArrayList<Integer> lista = new ArrayList<>();
		System.out.println("Unesite brojeve, 0 za kraj: ");

		while (prekid != 0) {
			try {
				int broj = unos.nextInt();
				if (broj == 0) {        // Ako je unos 0, prekidamo petlju
					prekid = 0;           
				} else {               // u suprotnom dodajemo broj listi.
					lista.add(broj);
				}

			} catch (InputMismatchException e) {
				System.out.println("Greska, pokusajte ponovo!");
				unos.next();
			}

		}
		// Petlja koja trazi najveci broj u listi.
		for (int i = 0; i < lista.size(); i++){
			if (lista.get(i) > max){  // Ako je trenutni broj veci od max,
				max = lista.get(i);   // postavljamo ga na vrijednost max.
			}
		}
		
		// Petlja koja racuna koliko se puta ponovio najveci broj
		for (int i = 0; i < lista.size(); i++){
			if (lista.get(i) == max){  // Ako je trenutni broj i najveci broj,
				brojac++;              // onda inktementujemo brojac.
			}
		}
		// Zatvaramo skener.
		unos.close();
		
		// Ispisujemo najveci broj i koliko se puta ponovio.
		System.out.println("Najveci broj je: " + max);
		System.out.println("Najveci broj se ponovio : " + brojac + " puta");
	}

}
