

import java.util.Scanner;

public class kapitel11aufgabe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie x ein: ");
		int x = sc.nextInt();		
		System.out.println("Geben Sie y ein: ");
		int y = sc.nextInt();
		
		double durch = (x + y) /2.0;
		double harmon = 2.0/ ( (1.0/x) + (1.0/y) );
		
		System.out.println("Aritmetisches Mittel: " + durch);
		System.out.println("Harmonisches Mittel: " + harmon);

		
	}

}
