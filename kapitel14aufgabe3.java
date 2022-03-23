import java.util.Scanner;

public class kapitel14aufgabe3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int rechtsvor, linksvor, rechtshint, linkshint;
		
		System.out.println("Reifendruck: rechter Vorderreifen");
		rechtsvor = sc.nextInt();
		System.out.println("Reifendruck: linker Vorderreifen");
		linksvor = sc.nextInt();
		System.out.println("Reifendruck: rechter Hinterreifen");
		rechtshint = sc.nextInt();
		System.out.println("Reifendruck: linker Hinterreifen");
		linkshint = sc.nextInt();

		if(rechtsvor==linksvor && rechtshint==linkshint) {
			System.out.print("Reifendruck ist OK.");
		}else {
			System.out.print("Reifendruck ist nicht in Ordnung.");

		}
		
	}

}
