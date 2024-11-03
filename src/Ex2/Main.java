package Ex2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produit produitAlimentaire = new ProduitAlimentaire(2.5, 100);
        System.out.println("Produit Alimentaire - Valeur du stock: " + produitAlimentaire.valeurStock());

        Produit produitElectronique = new ProduitElectronique(600, 20);
        System.out.println("Produit Electronique - Valeur du stock: " + produitElectronique.valeurStock());
	}
}
