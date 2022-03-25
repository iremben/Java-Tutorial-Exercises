import java.util.Scanner;

public class kapitel16aufgabe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		double  gesamt=0;
		
		System.out.println("Geben Sie n ein:  ");
		n=sc.nextInt();
		
		while(n>0) {
			gesamt+=(1.0)/n;
			n--;
		}
		
		System.out.print("\nDie Summe ist: " + gesamt);
		
	}

}
