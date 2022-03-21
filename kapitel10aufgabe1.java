import java.util.Scanner;

public class kapitel10aufgabe1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI;
		System.out.println("Geben Sie den Radius ein: ");
		int radius = sc.nextInt();
		
		System.out.println("Der radius ist"+radius+"Die Fläche beträgt: "+radius*radius*pi);
		
		
		
	}
}
