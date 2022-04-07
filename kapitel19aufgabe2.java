import java.util.Scanner;

public class kapitel19aufgabe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int monat=0;
		double w_gehalt=100.0;
		
		System.out.println("Monat: " + monat + "\tWirkstoffgehalt: " + w_gehalt );
		
		while(w_gehalt>50.0){
			w_gehalt=w_gehalt*96/100;
			monat++;
			System.out.print("Monat: " + monat + "\tWirkstoffgehalt: " + w_gehalt);
			if(w_gehalt>50.0)
				System.out.print("\n");
			else
				System.out.print(" ABGELAUFEN");
		}
		
	}

}
