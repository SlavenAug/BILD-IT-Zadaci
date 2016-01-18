package zadaci_16_01_2016;

import java.io.File;
import java.util.Scanner;

public class Zad3_Fajl {

	public static void main(String[] args) throws Exception {

		Scanner unos = new Scanner(System.in);
		// Varijabla za unos file-a
		String imeFile = "";
		// Uslov za while petlju
		boolean prekid = true;
		
		while (prekid) {

			try {
				// Unos ime file-a
				System.out.println("Unesite ime file-a");
				imeFile = unos.next();
				File file = new File(imeFile);
				// Skener objekti za citanje iz file-a
				Scanner citajPodatke = new Scanner(file);
				Scanner citajPodatke2 = new Scanner(file);

				int brojLinija = 0;
				int brojRijeci = 0;
				int brojKaraktera = 0;

				try {
					// broji linije texta
					while (citajPodatke.hasNext()) {
						String linijeTeksta = citajPodatke.nextLine();
						brojLinija++;
					}

					// broji rijeci i karaktere
					while (citajPodatke2.hasNext()) {
						String rijec = citajPodatke2.next();
						brojRijeci++;
						brojKaraktera += rijec.length();

					}
				} catch (Exception ex) {
					System.out.println("Greska prilikom citanja podataka");
					System.out.println();
				} finally {
					// zatvaramo resurse
					unos.close();
					citajPodatke.close();
					citajPodatke2.close();
				}

				// Ispis rezultata
				System.out.println("Broj linija texta: " + brojLinija);
				System.out.println("Broj rijeci: " + brojRijeci);
				System.out.println("Broj karaktera: " + brojKaraktera);
				prekid = false;

			} catch (Exception e) {
				System.out.println("File nije pronadjen");
				System.out.println();
				unos.nextLine();
			}

		}

	}
}
