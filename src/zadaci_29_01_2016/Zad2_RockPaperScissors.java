/*
 * Napisati program koji igra sa protivnikom rock-paper-scissors.
 * (papir-bunar-makaze ili tako nekako po naški) Program nasumično generiše
 * brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
 * korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
 * pobijedio, da li je računar pobijedio ili je bilo neriješeno. 
 */
package zadaci_29_01_2016;

import methods.Unos;

public class Zad2_RockPaperScissors {

	public static void main(String[] args) {
		// Generisanje nasumicnog broja za racunar.
		int comp = (int) (Math.random() * 3);
		// Postavljamo varijablu za ulazak u petlju.
		int user = 3;
		// Petlja vrti sve dok se ne unese 0, 1 ili 2.
		while (user < 0 || user > 2) {
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
			 * Metoda se nalazi u klasi Unos.
			 */
			System.out.println("0 - Rock \n1 - Paper \n2 - Scissors");
			user = Unos.inputInt();
		}

		// Ako su isti brojeve prikazuje nerijeseno.
		if (user == comp) {
			System.out.println("Result is eaven!" + selected(user, comp));
		} else {
			// Ako je user Rock a komp Sicssors, user pobjedjuje.
			if (user == 0 && comp == 2) {
				System.out.println("User win!" + selected(user, comp));
			} else if (user == 1 && comp == 0) {
				// Ako je user Paper a komp Rock, user pobjedjuje.
				System.out.println("User win!" + selected(user, comp));
			} else if (user == 2 && comp == 1) {
				// Ako je user Sicssors a komp Paper, user pobjedjuje.
				System.out.println("User win!" + selected(user, comp));
			} else { 
				// U ostalim slucajevima komp pobjedjuje.
				System.out.println("Computer win!" + selected(user, comp));
			}
		}

	}
	// Metoda koja vraca rock,paper ili scissors za dati broj.
	public static String name (int n){
		switch (n){
		case 0 : return "Rock";
		case 1 : return "Paper";
		case 2 : return "Scissors";
		default : return "Invalid input";
		}
	}
	// Metoda koja ispisuje rezultat.
	public static String selected (int user, int comp){
		return " User selected " + name(user) + " and computer selected " + name(comp);
	}

}
