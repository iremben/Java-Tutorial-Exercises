import java.util.Scanner;

public class kapitel13aufgabe3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Geben Sie den Anzahl der Posten: ");
		int anzahl = sc.nextInt();
		
		System.out.print("Geben Sie das Erhitzungszeit einer Posten: ");
		int eZeit = sc.nextInt();
		
		if (anzahl==1)
			System.out.print("\nEmpfohlene Erhitzungszeit ist: " + eZeit);

		if (anzahl==2)
			System.out.print("\nEmpfohlene Erhitzungszeit ist: " + eZeit*1.5);

		if (anzahl==3)
			System.out.print("\nEmpfohlene Erhitzungszeit ist: " + eZeit*2);

		if (anzahl>3)
			System.out.print("\nDas Erhitzen von mehr als drei Posten wird nicht empfohlen.");

	}

}
