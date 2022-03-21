import java.util.Scanner;

public class kapitel13aufgabe1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double versandKosten = 0.0;
		
		System.out.print("Geben sie den Artikel ein:  ");
		String artikel = sc.nextLine();
		
		System.out.print("Geben sie den Preis ein:  ");
		double preis = sc.nextDouble();
		
		System.out.print("expressversand (o==nein, 1==ja):  ");
		int express = sc.nextInt();
		
		if (preis<10.0)
			versandKosten+=2;
		
		if (preis>10.0)
			versandKosten+=3;
		
		if (express==1)
			versandKosten+=5;
		
		System.out.print("Rechnung \n  " + artikel + ": " + preis );
		System.out.print("\n  Versand: " + versandKosten);
		System.out.print("\n  Gesamt: " + (preis + versandKosten));

		
	}

}
