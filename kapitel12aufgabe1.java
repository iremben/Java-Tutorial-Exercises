

import java.util.Scanner;

public class kapitel12aufgabe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Geben Sie den Gesamtbetrag (in cent) ein :  ");
		int gesamt = sc.nextInt();
		
		if (gesamt > 1000)
			System.out.println("Discountpreis: " + gesamt*90/100);
		else
			System.out.println("There will be no discount.");
		
		
	}

}
