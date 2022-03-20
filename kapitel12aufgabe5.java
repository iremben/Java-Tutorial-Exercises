import java.util.Scanner;

public class kapitel12aufgabe5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Geburtsjahr:  ");
		int gJahr = sc.nextInt();
		
		System.out.print("Aktuelles Jahr:  ");
		int aktuell = sc.nextInt();
		
		if ((aktuell-gJahr)>=0)  // (aktuell<gJahr)
			System.out.println("Ihr alter ist: " + (aktuell-gJahr) );
		else if (aktuell-gJahr<0)
			System.out.println("Ihr alter ist: " + ((aktuell+100)-gJahr));
		else
			System.out.println("Error");
	}
}

