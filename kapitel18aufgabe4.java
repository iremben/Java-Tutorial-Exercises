import java.util.Scanner;

public class kapitel18aufgabe4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int eck_1_x, eck_1_y, eck_2_x, eck_2_y, breite=1, h�he=1, fl�che;

		System.out.println("\nCAD Programm");
		
		while (h�he!=0 && breite!=0) {
			
			System.out.println("\nErster Eckpunkt X-Koordinate:");
			eck_1_x=sc.nextInt();

			System.out.println("Erster Eckpunkt Y-Koordinate:");
			eck_1_y=sc.nextInt();

			System.out.println("Zweiter Eckpunkt X-Koordinate:");
			eck_2_x=sc.nextInt();

			System.out.println("Zweiter Eckpunkt Y-Koordinate:");
			eck_2_y=sc.nextInt();
			
			breite = Math.abs(eck_1_x - eck_2_x);
			h�he = Math.abs(eck_1_y - eck_2_y);
			fl�che = breite*h�he;
			
			System.out.println("Breite: " + breite + " H�he: " + h�he + " Fl�che: " + fl�che + "\n");

		}
		System.out.println("\nFertig!");
		
	}
}
