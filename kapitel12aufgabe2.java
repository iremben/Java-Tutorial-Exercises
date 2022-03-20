

import java.util.Scanner;

public class kapitel12aufgabe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Geben Sie der Anzahl der Schrauben ein:  ");
		int schraube = sc.nextInt();
		int schPreis = 5;
		
		System.out.println("Geben Sie der Anzahl der Muttern ein:  ");
		int mutter = sc.nextInt();
		int mutPreis = 3;

		System.out.println("Geben Sie der Anzahl der Unterlegscheiben ein:  ");
		int unterlegscheibe = sc.nextInt();
		int untPreis = 1;

		if (schraube>mutter || mutter>schraube) // oder !=
			System.out.println("Kontrolieren Sie Ihre Bestellung!");
		else
			System.out.println("Die Bestellung ist okay!");
		
		int kosten = schraube*schPreis + mutter*mutPreis + unterlegscheibe*untPreis;
		
		System.out.println("Gesamtbetrag: " + kosten);
		
	}

}
