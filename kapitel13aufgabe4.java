import java.util.Scanner;

public class kapitel13aufgabe4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Wilkommen zu Yertle's Schatzsuche\nGeben Sie den Namen der Spielfigur ein: ");  
		String name = sc.next();
		
		System.out.print("St�rke geben (1-10): ");
		int st�rke = sc.nextInt();
		
		System.out.print("Gesundheit eingeben (1-10): ");
		int ges = sc.nextInt();

		System.out.print("Gl�ck eingeben (1-10): ");
		int gl�ck = sc.nextInt();

		if (st�rke+ges+gl�ck<=15)
			System.out.print(name +", St�rke: " + st�rke + ", Gesundheit: " + ges + ", Gl�ck: " + gl�ck);
		else
			System.out.print("Sie haben Ihrer Spielfigur zu viele Punkte gegeben! Es wurden die Standardwerte zugewiesen:\n"
							+ name +", St�rke: 5, Gesundheit: 5, Gl�ck: 5");

	}
}
