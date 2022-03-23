import java.util.Scanner;

public class kapitel14aufgabe1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double girokonto, sparkonto;
		
		System.out.print("Geben Sie Ihr Girokontostand:  ");
		girokonto = sc.nextDouble();
		
		System.out.print("Geben Sie Ihr Sparkontostand:  ");
		sparkonto = sc.nextDouble();

		
		
		if(girokonto<=1000.0 || sparkonto<=1500) {
			System.out.println("Es wird eine Gebühr von 0.15$ erhoben.");
		}else
			System.out.println("Es wird keine Gebühr erhoben.");


		
	}

}
