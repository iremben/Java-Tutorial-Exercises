import java.util.Scanner;

public class kapitel17aufgabe4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Geben Sie die Größe von Baum: ");
		
		int anfangswert=sc.nextInt(), nulle, stern, nulle2, stern2;
		int zähler_stamm, zähler_baum ;
		
		zähler_baum = anfangswert;
		
		while(zähler_baum>0) {
			System.out.println("");
			nulle=zähler_baum-1;
			stern=(anfangswert-nulle)*2-1;
			
			while(nulle>0){
				System.out.print("-");
				nulle--;}
			
			while(stern>0){
				System.out.print("*");
				stern--;}
			
			zähler_baum--;
		}
		
		System.out.println("");
		zähler_stamm = 3;
		
		while(zähler_stamm>0) {
			nulle2 = anfangswert-2;	
			stern2=0;
			
			while(nulle2>0) {
				System.out.print("-");
				nulle2--;}
			
			while(stern2<3) {
				System.out.print("*");
				stern2++;}
			
			System.out.println("");
			zähler_stamm-=1;
		}
		
		sc.close();
		
	}

}
	
