package Ex2;
public class Main_c {
	 public static void main ( String [] args ) {
	 Compte cp = new Compte ( " 256 B301077 " , 500) ;

	 try {
	    cp . retirer (600) ; // Tentative de retrait �chou�e
	    System . out . println ( " Mise � jour du solde : " + cp .getSolde () ) ;
	 } 
	 catch ( Exception e ) {
	    System . out . println ( " Erreur : " + e . getMessage () ) ;
	 }
   }
}