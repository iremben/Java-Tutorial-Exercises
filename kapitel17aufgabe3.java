import java.util.Scanner;

public class kapitel17aufgabe3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Anfangszahl der Sterne:");
		int n = sc.nextInt();
		int n2 ;
		
		while(n>0) {
			
			n2=n;
			while(n2>0){
				System.out.print("*");
				n2--;
			}
			System.out.println("");
			n--;
		}
		
	}
}