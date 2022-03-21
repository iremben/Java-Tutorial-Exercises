import java.util.Scanner;

public class kapitel13aufgabe2 {
	public static void main(String[] args) {
		
		// effizienz = 1-tLuft / tDampf
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Geben Sie die Lufttemperatur ein: ");
		int tLuft = sc.nextInt();
		
		System.out.print("Geben Sie die Dampftemperatur ein: ");
		int tDampf = sc.nextInt();
		
		double effizienz = 1.0-tLuft/(tDampf+0.0) ;
		
		if (tDampf<373)
			System.out.println("Die Effizienz betraegt: 0" );
		else
			System.out.println("Die Effizienz betraegt: " + effizienz);

	}
}
