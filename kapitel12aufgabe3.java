

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class kapitel12aufgabe3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ihre Tankkapazität: ");
		int kapazität =  sc.nextInt();
		
		System.out.print("Geben Sie ihre Benzinanzeige in Prozent: ");
		int prozent = sc.nextInt();
		
		System.out.print("Geben Sie Benzinverbrauch ihre Fahrzeuges in Milen pro Gallone: ");
		int verbrauch = sc.nextInt();
		
		double zustand = verbrauch/kapazität*(100-prozent);
		System.out.print(zustand);
		if (zustand< 200)
			System.out.println("Tanken!");
		else
			System.out.println("Weiterfahren");
		
 
		
	}
}
