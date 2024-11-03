package Ex3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule[] vehicules = {
	            new Voiture("Toyota", "Essence"),
	            new Bateau("Titanic", "Diesel"),
	            new Hydravion("Hydravion1", "Kérosène")
	        };

	        for (Vehicule vehicule : vehicules) {
	            vehicule.afficherInfos();
	            vehicule.demarrer();
	            vehicule.arreter();
	        }

	        for (Vehicule vehicule : vehicules) {
	            if (vehicule instanceof Roulant) {
	                ((Roulant) vehicule).rouler();
	            }
	            if (vehicule instanceof Flottant) {
	                ((Flottant) vehicule).flotter();
	            }
	        }
	}
}
