

	class Lohn
	{
	  public static void main ( String[] args )
	  {
	    long   arbeitsstunden;
	    arbeitsstunden = 40;
	    double stundenlohn, steuersatz;
	    stundenlohn = 10.0;
	    steuersatz = 0.10;
	    System.out.println("Arbeitszeit: " + arbeitsstunden );
	    System.out.println("Bruttolohn: " + (arbeitsstunden * stundenlohn) );
	    System.out.println("Steuerbetrag: " + (arbeitsstunden * stundenlohn * steuersatz) );
	  }
	}

