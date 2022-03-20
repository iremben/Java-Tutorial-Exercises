

import java.util.Scanner;

public class kapitel12aufgabe4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Preis pro Pfund Packung A: ");
		double packungA = sc.nextDouble();
		
		System.out.print("Prozent mageres Fleisch Packung A: ");
		double prozentA = sc.nextDouble();
		
		System.out.print("Preis pro Pfund Packung B: ");
		double packungB = sc.nextDouble();
		
		System.out.print("Prozent mageres Fleisch Packung B: ");
		double prozentB = sc.nextDouble();
		
		double preisA = packungA/prozentA*100;
		
		double preisB = packungB/prozentB*100;
		
		System.out.println("Packung A kostet pro Pfund mageres Fleisch: " + preisA);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch: " + preisB);
	
		if (preisA>preisB) 
			System.out.println("Packung A ist preiswerter.");
		else
			System.out.println("Packung B ist preiswerter.");
		
		
	}

}
