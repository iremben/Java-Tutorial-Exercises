import java.util.Scanner;

public class kapitel18aufgabe3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int gewicht=1, kosten;
		double summe=3.0;
		
		while(gewicht>0) {
			
			System.out.println("Gewicht der Sendung:");
			gewicht = sc.nextInt();
			
			if(gewicht>10) {
				summe+=((gewicht-10)*0.25);
			}
			
			if(gewicht!=0)
				System.out.println("Versandkosten: $" + summe + "\n");
			
			summe=3.0;
		}
		System.out.println("bye");
	}

}
