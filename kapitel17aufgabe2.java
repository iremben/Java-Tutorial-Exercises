import java.util.Scanner;

public class kapitel17aufgabe2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n, n1;
		double x, ergebnis;
		
		System.out.print("Geben Sie x ein:  ");
		x = sc.nextDouble();
		
		System.out.print("Geben Sie n ein:  ");
		n = sc.nextInt();
		ergebnis=x;
		n1 = n-1;
		
		if (n<0)
			System.out.print("n muss ein positiver Integer sein.");
		else {
			
			while(n1>0) {
			ergebnis= ergebnis*x;
			n1--;
			}
		
			System.out.print(x + " hoch " + n + " ergibt " + ergebnis);
		}
		
	}

}
