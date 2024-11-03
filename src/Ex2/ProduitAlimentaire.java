package Ex2;

class ProduitAlimentaire implements Produit {
    private double prixUnitaire;
    private int quantite;

    public ProduitAlimentaire(double prixUnitaire, int quantite) {
        this.prixUnitaire = prixUnitaire;		
        this.quantite = quantite;
    }
    
    
    public double valeurStock() {
        return prixUnitaire * quantite;
    }
}