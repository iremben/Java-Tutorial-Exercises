import java.util.Scanner;

public class kapitel19aufgabe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int monat=0;
		double betrag, betrag2=0, saldo=1000.0;
		
		
		System.out.println("Geben Sie den monatlichen Betrag ein:");
		betrag=sc.nextInt();
		
		while(saldo>0) {
			monat+=1;
			saldo = (saldo*101.5/100)- betrag;
			betrag2+=betrag;
			System.out.println("Monat: " + monat + "\tSaldo: " + saldo + "\tGesamtbetrag: " + betrag2);
		}
	}
}
