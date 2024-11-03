package Ex3;

public class Voiture extends Vehicule implements Roulant{
	
	public Voiture(String nom,String typeCarburant){
		super(nom,typeCarburant);
	}
	
	@Override
	public void demarrer(){
		System.out.println("La voiture demarre.");
	}
	
	@Override
	public void arreter(){
		System.out.println("La voiture arrete.");
	}
	
	//@Override
	public void rouler(){
		System.out.println("La voiture roule.");
	}
}
