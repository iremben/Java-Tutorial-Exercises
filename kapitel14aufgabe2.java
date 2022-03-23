import java.util.Scanner;

public class kapitel14aufgabe2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int pfund;
		
		System.out.print("Geben Sie Ihr Gewicht ein:  ");
		pfund=sc.nextInt();
		
		if(pfund>235 && pfund<265)
			System.out.print("Sie sind zum Wettbewerb zugelassen.");
		else
			System.out.print("Sie sind zum Wettbewerb nicht zugelassen.");

		
		
	}
}
