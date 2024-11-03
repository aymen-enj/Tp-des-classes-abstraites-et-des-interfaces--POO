package Ex1;

public class Cercle extends Forme{
	private double rayon;
	
	public Cercle(double rayon){
		this.rayon=rayon;
	}
	
	@Override
	double surface(){
		return Math.PI*rayon*rayon;
	}
	
	@Override
	double perimetre(){
		return 2*Math.PI*rayon;
	}
}
