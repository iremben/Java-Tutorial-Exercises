import java.util.Scanner;

public class kapitel13aufgabe4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Wilkommen zu Yertle's Schatzsuche\nGeben Sie den Namen der Spielfigur ein: ");  
		String name = sc.next();
		
		System.out.print("Stärke geben (1-10): ");
		int stärke = sc.nextInt();
		
		System.out.print("Gesundheit eingeben (1-10): ");
		int ges = sc.nextInt();

		System.out.print("Glück eingeben (1-10): ");
		int glück = sc.nextInt();

		if (stärke+ges+glück<=15)
			System.out.print(name +", Stärke: " + stärke + ", Gesundheit: " + ges + ", Glück: " + glück);
		else
			System.out.print("Sie haben Ihrer Spielfigur zu viele Punkte gegeben! Es wurden die Standardwerte zugewiesen:\n"
							+ name +", Stärke: 5, Gesundheit: 5, Glück: 5");

	}
}
