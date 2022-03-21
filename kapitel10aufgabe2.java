import java.util.Scanner;

public class kapitel10aufgabe2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("geben sie die cent ein:  ");
		int cent = sc.nextInt();
		System.out.println("Das ergibt " + cent/100 + " dollar und " + cent%100 + " cent.");
		
		
	}
}
