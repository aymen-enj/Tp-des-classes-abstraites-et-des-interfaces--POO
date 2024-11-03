package Ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forme crcl1 = new Cercle(3);
		Forme rctngl1= new Rectangle(3,7);
		Forme tr1= new Triangle(14,10,12);
		
		System.out.println("La surface du cercle est: "+crcl1.surface());
		System.out.println("Le perimetre du cercle est: "+crcl1.perimetre());
		
		System.out.println("La surface du rectangle est: "+ rctngl1.surface());
		System.out.println("Le perimetre du rectangle est: "+ rctngl1.perimetre());
		
		System.out.println("La surface du triangle est: "+ tr1.surface());
		System.out.println("Le perimetre du triangle est: "+ tr1.perimetre());
	}
}