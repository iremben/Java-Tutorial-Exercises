import java.util.Scanner;

public class kapitel15aufgabe2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String wort;
		int länge;
		
		System.out.println("Geben Sie ein Wort ein:  ");
		wort=sc.next();
		länge=wort.length();
		
		while(länge>0) {
			System.out.println(wort);
			länge--;
			
		}
		
		
		
		
	}
}
