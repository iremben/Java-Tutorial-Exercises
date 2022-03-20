

import java.util.Scanner;

public class kapitel11aufgabe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Geben Sie Kosten je Kilowatt in Cent ein:  ");
		double kwct = sc.nextDouble();
		
		System.out.println("Geben Sie Anzahl der Kilowatt pro Jahr ein:  ");
		double kwst = sc.nextDouble();

		System.out.println("Jahreskosten " + kwct*kwst/100);


	}

}
