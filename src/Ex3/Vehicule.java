package Ex3;

abstract class Vehicule{
	protected String nom;
	protected String typeCarburant;
	
	public Vehicule(String nom,String typeCarburant){
		this.nom=nom;
		this.typeCarburant=typeCarburant;
	}
	
	abstract void demarrer();
	abstract void arreter();
	
	public void  afficherInfos(){
		System.out.println("Le nom du vehicule: "+nom+", son type de carburant: "+typeCarburant);
	}
}
