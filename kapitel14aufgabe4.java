import java.util.Scanner;

public class kapitel14aufgabe4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int rechtsvor, linksvor, rechtshint, linkshint;
		
		System.out.println("Reifendruck: rechter Vorderreifen");
		rechtsvor = sc.nextInt();
		if(rechtsvor>45 || rechtsvor<35) 
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs.");
		
		System.out.println("Reifendruck: linker Vorderreifen");
		linksvor = sc.nextInt();
		if(linksvor>45 || linksvor<35) 
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs.");
		
		System.out.println("Reifendruck: rechter Hinterreifen");
		rechtshint = sc.nextInt();
		if(rechtshint>45 || rechtshint<35) 
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs.");
		
		System.out.println("Reifendruck: linker Hinterreifen");
		linkshint = sc.nextInt();
		if(linkshint>45 || linkshint<35) 
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs.");
		
		if(rechtsvor==linksvor && rechtshint==linkshint) {
			if(rechtsvor<45 && rechtsvor>35 && rechtshint<45 && rechtshint>35) {
				System.out.println("Der Reifendruck ist in Ordnung.");
			}else {
				System.out.print("Reifendruck ist nicht in Ordnung.");
			}
		}else {
			System.out.print("Reifendruck ist nicht in Ordnung!");
		}
		
	}

}
