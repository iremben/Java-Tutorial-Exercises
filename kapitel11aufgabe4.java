

import java.util.Scanner;

public class kapitel11aufgabe4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein double ein:  ");
		
		double x = sc.nextDouble();
		
		double zweierLog = Math.log(x) / Math.log(2);
		
		System.out.print("Der Zweierlogaritmus von " + x + " ist "+ zweierLog);

		
	}
}
