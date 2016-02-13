package zadaci_12_02_2016;

public class Zad5_Loan {

	protected double annualInterestRate;
	protected int numberOfYears;
	protected double loanAmount;
	java.util.Date loanDate;

	// No- arg konstruktor
	public Zad5_Loan() {

	}

	// Konstrktor sa data fields poljima
	public Zad5_Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate = new java.util.Date();

	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Metod za postavljanje nove godisnje kamatne stope.
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		// ako je godisna kamatna stopa 0 ili negativna baci exception
		if (annualInterestRate <= 0) {
			throw new IllegalArgumentException("Annual tnterest rate cannod be 0 or negative");
		} else {
			this.annualInterestRate = annualInterestRate;
		}
	}

	// Metod vraca broj godina.
	public int getNumberOfYears() {
		return numberOfYears;
	}

	// Metod postavlja broj godina
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if (numberOfYears <= 0) {
			throw new IllegalArgumentException("Number of years cannot be 0 or negative");
		} else {
			this.numberOfYears = numberOfYears;
		}
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	// Motod za postavljanje kolicine kamate.
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if (loanAmount <= 0) {
			throw new IllegalArgumentException("Loand amount cannot be 0 or negative");
		} else {
			this.loanAmount = loanAmount;
		}
	}

	public java.util.Date getLoanDate() {
		return loanDate;
	}

	// Metod racuna mjesecnu ratu.
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
	}

}
