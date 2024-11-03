package Ex3;

public class Hydravion extends Vehicule implements Roulant ,Flottant{
	
	public Hydravion(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }
	
	 @Override
	 public void demarrer() {
	    System.out.println("L'hydravion démarre pour décoller.");
	 }

	 @Override
	 public void arreter() {
	    System.out.println("L'hydravion atterrit et s'arrête.");
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
