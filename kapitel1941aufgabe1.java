import java.util.Scanner;

public class kapitel1941aufgabe1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double constant=1, c=0.83 , N=2;
		
		
		for( int t = 0; t < 26; t+=1) {
			System.out.print("sheeps:   " + N + "     \tyears:   " + t);
			if(N<80)
				System.out.println("\tsupervision not needed");
			else
				System.out.println("\tsupervision needed!!!");
			constant*=c;
	        N=220/(1 +(10*constant));
	    }

	    
		
		// mein erstes versuch:
		//for(t=0; t<26; t++){
			//System.out.println("N value:   " + N + "     \tJahr:" + t + "  \tc=" + constant);
			//constant*=c;
			//N+=220/(1+(10*c));
			
		//}
	
		//aufgabe macht kein sinn!! es muss ein anfangszahl geben und 
		//rechnung muss von das zahl abhängig sein. ich hab beim ersten 
		//versuch  als anfangszahl 20 genutzt (weil es in aufgabenstellung 20 gegeben ist)
		//aber das ergebnis war so komisch. 
	}

}
