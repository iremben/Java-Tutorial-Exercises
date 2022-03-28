import java.util.Scanner;

public class kapitel18aufgabe2 {
	public static void main(String[] args) {
		System.out.println("Programm Meilen pro Gallone");
		
		Scanner sc = new Scanner(System.in);
		int u_grenze, o_grenze, zahl=1, in_summe=0, aus_summe=0;
		System.out.println("Bereiche addieren");
		
		System.out.println("Untergrenze des Bereichs:");
		u_grenze = sc.nextInt();
		
		System.out.println("Obergrenze des Bereichs:");
		o_grenze = sc.nextInt();

		
		while(zahl!=0) {
			System.out.println("Daten eingeben:");
			zahl = sc.nextInt();
			if ((zahl>u_grenze)&&(zahl<o_grenze))
				in_summe+=zahl;
			if ((zahl<=u_grenze)||(zahl>=o_grenze))
				aus_summe+=zahl;
		}
		
		System.out.println("Summe der Werte innerhalb des Bereichs:" + in_summe);
		System.out.println("Summe der Werte ausserhalb des Bereichs:" + aus_summe);
		
	}
}
