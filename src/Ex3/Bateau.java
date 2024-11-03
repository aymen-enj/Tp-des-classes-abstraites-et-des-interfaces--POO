package Ex3;

public class Bateau extends Vehicule implements Flottant{
	public Bateau(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }

    @Override
    public void demarrer() {
        System.out.println("Le bateau commence � naviguer.");
    }

    @Override
    public void arreter() {
        System.out.println("Le bateau s'arr�te de naviguer.");
    }
    
    //@Override
    public void flotter() {
        System.out.println("Le bateau flotte");
    }
}