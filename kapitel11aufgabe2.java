

import java.util.Scanner;

public class kapitel11aufgabe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Geben Sie die Anzahl der Sekunden ein:  ");
		double t = sc.nextDouble();
		double g = 9.81;
		double entf = (1.0/2)*g*t*t;
		
		System.out.println("Die Entfernung beträgt: " + entf);
		
		
	}

}
