/*
 * (The Time class) Design a class named Time. The class contains:
 * ■ The data fields hour, minute, and second that represent a time.
 * ■ A no-arg constructor that creates a Time object for the current time. (The
 * values of the data fields will represent the current time.)
 * ■ A constructor that constructs a Time object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds. (The values of the data
 * fields will represent this time.)
 * ■ A constructor that constructs a Time object with the specified hour, minute,
 * and second.
 * ■ Three getter methods for the data fields hour, minute, and second,
 * respectively.
 * ■ A method named setTime(long elapseTime) that sets a new time
 * for the object using the elapsed time. For example, if the elapsed time is
 * 555550000 milliseconds, the hour is 10, the minute is 19, and the second is 10.
 */
package zadaci_06_02_2016;

public class Zad1_Time {

	public static void main(String[] args) {

		Time t1 = new Time();
		Time t2 = new Time(555550000);

		System.out.println(t1);
		System.out.println(t2);

	}
}

class Time {

	// Postavljamo vremensku zonu.
	final int timeZone = 1;

	private int hours;
	private int minutes;
	private int seconds;

	// No-arg konstruktor koji pravi objekat sa trenutnim vremenom.
	public Time() {
		setTime(System.currentTimeMillis());

	}

	// Konstruktor za custom vrijeme.
	public Time(long elapseTime) {
		seconds = (int) (elapseTime / 1000) % 60;
		minutes = (int) (elapseTime / 1000) / 60 % 60;
		hours = (int) (elapseTime / 1000) / 60 / 60 % 24;
	}

	// Konstruktor sa manuelnim unosom vremena.
	public Time(int hours, int minutes, int seconds) {
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);

	}

	// Metoda racuna vrijeme na osnovu milisekundi.
	public void setTime(long elapseTime) {
		seconds = (int) (elapseTime / 1000) % 60;
		minutes = (int) (elapseTime / 1000) / 60 % 60;
		hours = (int) (elapseTime / 1000) / 60 / 60 % 24 + timeZone;
	}

	// Getteri i Setteri.

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours < 0 || hours > 23) {
			System.out.println("Hours must be from 1 to 23!");
		} else {
			this.hours = hours;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 59) {
			System.out.println("Minutes must be from 0 to 59!");
		} else {
			this.minutes = minutes;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (minutes < 0 || minutes > 59) {
			System.out.println("Seconds must be from 0 to 59!");
		} else {
			this.seconds = seconds;
		}
	}

	@Override
	public String toString() {

		return hours + ":" + minutes + ":" + seconds;
	}

}
