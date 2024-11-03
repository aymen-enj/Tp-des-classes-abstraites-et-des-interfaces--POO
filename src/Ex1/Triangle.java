package Ex1;

public class Triangle extends Forme{
	private double base;
	private double hauteur;
	private double cote3;
	
	public Triangle(double base,double hauteur,double cote3){
		this.base=base;
		this.hauteur=hauteur;
		this.cote3=cote3;
	}
	
	@Override
	double surface(){
		return (base*hauteur)/2;
	}
	
	@Override
	double perimetre(){
		return base+hauteur+cote3;
	}
}
