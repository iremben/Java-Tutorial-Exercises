import java.util.Scanner;

public class kapitel18aufgabe1 {

	public static void main(String[] args) {
		System.out.println("Programm Meilen pro Gallone");
		
		Scanner sc = new Scanner(System.in);
		int anf_meilen, end_meilen, gallonen;
		
		
		System.out.println("Anfangsstand Meilen:");
		anf_meilen=sc.nextInt();
		
		while (anf_meilen>=0){
			System.out.println("Endstand Meilen:");
			end_meilen=sc.nextInt();
			System.out.println("Gallonen");
			gallonen=sc.nextInt();
			System.out.print("Meilen pro Gallone:");
			System.out.println(((end_meilen-anf_meilen)+0.0)/gallonen);
			System.out.println();
			System.out.println("Anfangsstand Meilen:");
			anf_meilen=sc.nextInt();
		}
		
		System.out.println("bye");
		
		
	}

}
