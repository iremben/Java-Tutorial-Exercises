import java.util.Scanner;

public class kapitel17aufgabe1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n, quad=0, kubik=0;
		
		System.out.println("Geben Sie n ein:  ");
		n = sc.nextInt();
		
		while(n>0) {
			quad += n*n;
			kubik += n*n*n;
			n--;
		}
		System.out.println("Die Quadratsumme ist:  " + quad);
		System.out.println("Die Kubiksumme ist:  " + kubik);
		
	}

}
