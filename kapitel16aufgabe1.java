import java.util.Scanner;

public class kapitel16aufgabe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int anzahl, gesamt=0;
		
		System.out.println("Wie viele Integer sollen addiert werden:  ");
		anzahl=sc.nextInt();
		
		while(anzahl>0) {
			System.out.println("Geben Sie einen Integer ein:  ");
			gesamt+=sc.nextInt();
			anzahl--;
		}
		
		System.out.println("\nDie Summe ist: " + gesamt);
		
	}

}
