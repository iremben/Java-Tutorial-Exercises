import java.util.Scanner;

public class kapitel15aufgabe2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String wort;
		int l�nge;
		
		System.out.println("Geben Sie ein Wort ein:  ");
		wort=sc.next();
		l�nge=wort.length();
		
		while(l�nge>0) {
			System.out.println(wort);
			l�nge--;
			
		}
		
		
		
		
	}
}
