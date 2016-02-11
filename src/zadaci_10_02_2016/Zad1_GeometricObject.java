package zadaci_10_02_2016;

import java.util.Date;

public class Zad1_GeometricObject {

	private String color = "white";
	private boolean filled;
	private Date dateCreated;

	// Konstruktor kreira defoult objekat.
	public Zad1_GeometricObject() {
		dateCreated = new Date();
	}

	// Konstruktor kreira objekat sa vrijednostima.
	public Zad1_GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}

	// Getteri i setteri.
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor " + color + "\nfilled " + filled;
	}

}
