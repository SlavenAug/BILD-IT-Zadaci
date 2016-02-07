package zadaci_06_02_2016;

public class Zad4_StackOfIntegers {
	public static final int DEFAULT_CAPACITY = 16;
	private int size;
	private int[] elements;

	// Konstruktor kreira stack kapaciteta 16.
	public Zad4_StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	// Konstruktor kreira stack sa odredjenim kapacitetom.
	public Zad4_StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	// Postavljamo vrijednost na vrh stack-a.
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	// Vraca i odstranjuje prvu vrijednost u stacku.
	public int pop() {
		return elements[--size];
	}

	// Provjerava da li je stack prazan.
	public boolean empty() {
		return size == 0;
	}

	// Vraca broj elementa u stacku.
	public int getSize() {
		return size;
	}
}