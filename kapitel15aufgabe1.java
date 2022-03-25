import java.util.Scanner;

public class kapitel15aufgabe1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int start, end;
		
		System.out.print("Startwert:");
		start = sc.nextInt();
		
		System.out.print("Endwert:");
		end = sc.nextInt();
		
		while(start<=end) {
			System.out.println(start);
			start++;
		}
		
		
		
	}

}
