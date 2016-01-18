package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unos {
	
	static Scanner unos = new Scanner (System.in);
	
	
	public static int inputInt(){
		int i = 0;
		boolean prekid = true;
		
		while (prekid){
			try{
			 i = unos.nextInt();
			 prekid = false;
			} catch (InputMismatchException e){
				System.out.println("Niste unijeli cjeli broj, pokusajte ponovo!");
				unos.nextLine();
			}
		}
		return i;
	}
	
	
	
	
	public static double inputDouble(){
		double i = 0.0;
		boolean prekid = true;
		
		while (prekid){
			try{
				i = unos.nextDouble();
				prekid = false;
			} catch(InputMismatchException e){
				System.out.println("Niste unije double vrijednost, pokusajte ponovo!");
				unos.nextLine();
			}
		}
		return i;
	}

}