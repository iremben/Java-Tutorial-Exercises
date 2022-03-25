import java.util.Scanner;

public class kapitel15aufgabe3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String wort1, wort2;
		int punkte;
		
		System.out.println("Geben Sie das erste Wort ein:  ");
		wort1=sc.next();

		System.out.println("Geben Sie das zweite Wort ein:  ");
		wort2=sc.next();
		
		punkte=30-(wort1.length()+wort2.length());
		
		System.out.print("\n"+wort1);
		
		while(punkte>0) {
			System.out.print(".");
			punkte--;
		}
		
		System.out.print(wort2);
	}
}
