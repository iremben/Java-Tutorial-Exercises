import java.util.Scanner;

public class kapitel17aufgabe4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Geben Sie die Gr��e von Baum: ");
		
		int anfangswert=sc.nextInt(), nulle, stern, nulle2, stern2;
		int z�hler_stamm, z�hler_baum ;
		
		z�hler_baum = anfangswert;
		
		while(z�hler_baum>0) {
			System.out.println("");
			nulle=z�hler_baum-1;
			stern=(anfangswert-nulle)*2-1;
			
			while(nulle>0){
				System.out.print("-");
				nulle--;}
			
			while(stern>0){
				System.out.print("*");
				stern--;}
			
			z�hler_baum--;
		}
		
		System.out.println("");
		z�hler_stamm = 3;
		
		while(z�hler_stamm>0) {
			nulle2 = anfangswert-2;	
			stern2=0;
			
			while(nulle2>0) {
				System.out.print("-");
				nulle2--;}
			
			while(stern2<3) {
				System.out.print("*");
				stern2++;}
			
			System.out.println("");
			z�hler_stamm-=1;
		}
		
		sc.close();
		
	}

}
	
