package MiniKalendar;

import methods.Unos;

public class Kalendar {
	public static void main(String[] args) throws Exception {

		// Kreiramo objekat.
		Options kalendar = new Options();
		// Inicijalizacija koji mjesec ima koliko dana.
		int[] brDanaMjeseca = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Petlja koja vrti cijeli proces.
		boolean prekid = true;
		while (prekid) {

			System.out.println("Unesite godinu: ");
			int godina = Unos.inputInt();
			System.out.println("Unesite mjesec 01-12: ");
			int mjesec = Unos.inputInt() - 1;
			// Ako je unos manji od 0 ili veci od 12 ispisuje gresku.
			while (mjesec > 12 || mjesec < 0) {
				System.out.println("Pogresan unos, unesite mjesec 01-12:");
				System.out.println("Pokusajte ponovo!");
				mjesec = Unos.inputInt() - 1;
			}

			// Pozivamo metodu za ispis kalendara.
			kalendar.printCalendar(godina, mjesec);
			System.out.println();
			System.out.println();

			String fileName = ".txt";
			fileName = mjesec + "" + godina + fileName;
			// Ako nije prijestupna dodjeljujemo joj 29. dan.
			if (godina % 100 == 0) {
				if (godina % 400 == 0) {
					brDanaMjeseca[1] = 29;
				}
			} else if (godina % 4 == 0) {
				brDanaMjeseca[1] = 29;
			}

			// Kreiramo beskonacnu petlju.
			boolean prekid1 = true;
			while (prekid1) {
				System.out.println("1  Pogledaj podsjetnik:");
				System.out.println("2  Dodaj podsjetnik:");
				System.out.println("3  Ponovo unesite godinu i mjesec:");
				System.out.println("4  Izlaz!");

				// Kreiramo unos za izbor korisnika.
				int izbor = Unos.inputInt();

				if (izbor == 1) {
					System.out.println("Unesite dan za koji zelite vidjeti podsjetnik: ");
					int dan = Unos.inputInt();
					String fileName1 = dan + fileName;
					boolean prekid2 = true;
					while (prekid2) {
						/*
						 * Ako je unijeti dan prevelik iscitava gresku, u
						 * suprotnom poziva metodu za citanje podsjetnika.
						 */
						if (dan > brDanaMjeseca[mjesec]) {
							System.out.println("Unijeli ste prevelik broj");
							System.out.println();
							prekid2 = false;
						} else {
							System.out.println("_________________Podsjetnik________________");
							// Pozivamo metodu za iscitavanje podsjetnika.
							kalendar.readData(fileName1);
							prekid2 = false;
						}
					}
				}
				if (izbor == 2) {

					System.out.println("Unesite dan za koji zelite unijeti podsjetnik: ");
					int dan = Unos.inputInt();

					// Ako je dan izvan dosega ispisuje gresku, u suprotnom
					// zapisuje podsjetnik.
					while (dan > brDanaMjeseca[mjesec]) {
						System.out.println("Niste unijeli odgovarajuci broj, pokusajte ponovo! ");
						dan = Unos.inputInt();
					}
					String name = dan + fileName;
					kalendar.writeData(name);

				}
				// Izlazi iz petlje.
				if (izbor == 3) {
					break;

				}

				// Izlazi iz glavne petlje i gasi program.
				if (izbor == 4) {
					prekid = false;
					System.out.println("Izasli ste iz programa!");
					break;
				}

				if (izbor < 0 || izbor > 4) {
					System.out.println("Niste unijeli odgovarajuci broj, pokusajte ponovo!");
				}

			}

		}

	}
}
