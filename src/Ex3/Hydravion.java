package Ex3;

public class Hydravion extends Vehicule implements Roulant ,Flottant{
	
	public Hydravion(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }
	
	 @Override
	 public void demarrer() {
	    System.out.println("L'hydravion d�marre pour d�coller.");
	 }

	 @Override
	 public void arreter() {
	    System.out.println("L'hydravion atterrit et s'arr�te.");
	 }
	 
	 public void voler(){
		 System.out.println("L'hydravion vole.");
	 }
	 
	 //@Override
	 public void flotter(){
		 System.out.println("L'hydravion flotte");
	 }
	 
	 public void rouler(){
		 System.out.println("L'hydravion ne roule pas");
	 }
}
