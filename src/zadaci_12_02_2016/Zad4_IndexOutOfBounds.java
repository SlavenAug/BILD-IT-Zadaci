/*(ArrayIndexOutOfBoundsException) Write a program that meets the following
requirements:
- Creates an array with 100 randomly chosen integers.
- Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message Out of Bounds.*/
package zadaci_12_02_2016;

public class Zad4_IndexOutOfBounds {

	public static void main(String[] args) {
		// Kreriramo niz od 100 random vrijednosti.
		int[] arr = randomArray();

		// Postavljamo uslov petlje.
		boolean condition = true;
		// Petlja se izvrsava sve dok se ne unese odgovarajuci indeks niza.
		while (condition) {
			try {
				// Poziv metode za unos iz prethodnog zadatka.
				int i = Zad3_InputValidation.input();
				System.out.println("Value at arr[" + i + "] is: " + arr[i]);
				// ako je unseni indeks u granicama,
				// postavlja se uslov za izlaz iz petlje
				condition = false;
			} catch (IndexOutOfBoundsException e) {
				// ako je index veci od 99 ili manji od nule, obavijesti
				// korisnika da unese ponovo.
				System.out.println("Out of bounds. Enter index from 0 to 99.");
			}
		}
	}

	// Metod za kreiranje niza sa nasumicnim brojevima.
	public static int[] randomArray() {
		// Kreiramo niz.
		int[] array = new int[100];
		// Petlja dodjeljuje nasumivne vrijenosti svakom elementu.
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

}
