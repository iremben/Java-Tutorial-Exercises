import java.util.Scanner;

public class kapitel10aufgabe3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("geben sie das wechselgeld ein:  ");
		int cent = sc.nextInt();
		int dollar = cent/100;
		cent = cent - 100*dollar;
		int quarter = cent/25;
		cent = cent - 25*quarter;
		int dime = cent/10;
		cent = cent -10*dime;
		int nickel = cent/5;
		cent = cent -5*nickel;
		
		
		
		System.out.print("Das wechselgeld ist " + dollar + " dollar, " + quarter + " quarter, " + dime + " dime, " + nickel + " nickel und " + cent + " cent.");
		
		
	}
}
