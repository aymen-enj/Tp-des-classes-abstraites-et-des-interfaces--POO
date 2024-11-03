package Ex2;

class ProduitElectronique implements Produit {
    private double prixUnitaire;
    private int quantite;

    public ProduitElectronique(double prixUnitaire, int quantite) {
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    
    public double valeurStock() {
        return prixUnitaire * quantite;
    }
}

