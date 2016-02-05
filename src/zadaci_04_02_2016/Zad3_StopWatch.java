/*
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * - Private data fields startTime and endTime with getter methods.
 * - A no-arg constructor that initializes startTime with the current time.
 * - A method named start() that resets the startTime to the current time.
 * - A method named stop() that sets the endTime to the current time.
 * - A method named getElapsedTime() that returns the elapsed time for the
 *   stopwatch in milliseconds.
 */
package zadaci_04_02_2016;

import methods.Unos;

public class Zad3_StopWatch {

	public static void main(String[] args) {
		StopWatch stoperica = new StopWatch();
		boolean prekid = true;

		System.out.println("Unesite 0 za izlaz iz programa");
		System.out.println("Unesite 1 za pokretanje stoperice");
		while (prekid) {
			int input = Unos.inputInt();
			if (input < 0 || input > 2) {
				System.out.println("Niste ispravno unijeli broj, pokusajte ponovo!");
			}
			if (input == 1) {
				System.out.println("Pokrenuli ste stopericu, unesite 2 da bi ste zaustavili vrijeme.");
				stoperica.setStartTime();
			}
			if (input == 2) {
				stoperica.setEndTime();
				System.out.printf("Elapsed time: %3.2f seconds:", stoperica.getElapsedTime());
				System.out.println("\nUnesite 0 za izlaz iz programa");
				System.out.println("Unesite 1 za pokretanje stoperice");
			}

			if (input == 0) {
				System.out.println("Izasli ste iz programa!");
				break;
			}

		}
	}
}

// Klasa StopWatch
class StopWatch {
	// Promjenljive za cuvanje pocetnog i krajnjeg vremena.
	private long startTime;
	private long endTime;

	// Getteri i setteri.
	public long getStartTime() {
		return startTime;
	}

	public void setStartTime() {
		this.startTime = System.currentTimeMillis();
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime() {
		this.endTime = System.currentTimeMillis();
	}

	// Konstruktor StopWatch koji pokrece vrijeme u ms.
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}

	// Metod za startovanje stoperice.
	public void start() {
		startTime = System.currentTimeMillis();
	}

	// Metoda za zaustavljanje vremena.
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// Metoda za vracanje ukupnog vremena koji se stopao.
	public double getElapsedTime() {
		return (endTime - startTime) / 1000.0;
	}

}
