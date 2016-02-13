/*
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 * throw IllegalArgumentException if the loan amount, interest rate, or
 * number of years is less than or equal to zero.
 */
package zadaci_12_02_2016;

public class Zad5_IllegalArgumentException {

	public static void main(String[] args) {

		Zad5_Loan loan = null;

		try {
			System.out.println("Initializing three Loan instances.");

			// Broj godina sa negativnom vrijednosti.
			loan = new Zad5_Loan(4.3, -1, 33333);

		} catch (IllegalArgumentException e) {
			// Ispisuje poruku.
			System.out.println(e.getMessage());
		}

		try {
			// Prikazuje mjesecnu kamatu.
			System.out.println(loan.getMonthlyPayment());
		} catch (NullPointerException e) {
			// Prikazuje poruku exception-a.
			System.out.println("Object cannot be null! Try to initialize object.");
		}
	}

}
