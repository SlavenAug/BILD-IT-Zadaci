/*
 * Napisati program koji pita korisnika da unese cijeli
 * broj za današnji dan u sedmici (0 za ponedjeljak, 1 za utorak...)
 * i da unese broj dana nakon današnjeg dana te mu ispiše koji je to
 * dan u buduænosti. (Primjer: ako korisnik unese 1 kao današnji dan a
 * 3 kao dan u buduænosti program mu ispisuje da je danas utorak
 * a dan u buduænosti je petak.) 
 */
package zadaci_22_01_2016;

import methods.Unos;

public class Zad1_DanUBuducnosti {
	
	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		boolean prekid = true;
		int dan = 0;
		// Vrti petlju sve dok ne unese ispravan broj.
		while (prekid){
			System.out.println("Unesite danasnji dan(0 za ponedeljak, 1 za utorak...)");
			dan = Unos.inputInt();
			if (dan >= 0 && dan <= 6){
				prekid = false;
				break;
			}
		}
		System.out.println("Unesite broj dana u buducnosti");
		int broj = Unos.inputInt();
		
		// Racuna buduci dan.
		int buduciDan = (dan + broj) % 7;
		// Ispisuje rezultat.
		System.out.println("Danas je " + dani(dan) + ", a dan u buducnosti je " + dani(buduciDan));
	}
	
	public static String dani (int dan){
		switch (dan){
		case 0: return "Ponedeljak";
		case 1: return "Utorak";
		case 2: return "Srijeda";
		case 3: return "Cetvrtak";
		case 4: return "Petak";
		case 5: return "Subota";
		case 6: return "Nedelja";
		default: return "Pogresan dan";
		}
	}

}
