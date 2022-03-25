import java.util.Scanner;

public class kapitel16aufgabe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double zähler, anzahl, durch=0, qdurch=0, zahl, stab;
		
		System.out.println("Anzahl von Zahlen:  ");
		anzahl=sc.nextInt();
		zähler = anzahl;
		
		while(zähler>0) {
			System.out.print("Geben Sie ein Zahl ein: ");
			zahl = sc.nextDouble();
			durch+=zahl;
			qdurch+=zahl*zahl;
			zähler--;
		}
		
		stab = Math.sqrt((qdurch/anzahl)-((durch/anzahl)*(durch/anzahl)));
		
		System.out.println(stab);
		
	}

}
