package Ex1;

public class Rectangle extends Forme{
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur,double largeur){
		this.longueur=longueur;
		this.largeur=largeur;
	}
	
	@Override
	double surface(){
		return longueur*largeur;
	}
	@Override
	double perimetre(){
		return 2*(largeur+longueur);
	}
}
