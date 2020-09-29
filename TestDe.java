package Exercice1;

public class TestDe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		De de = new De();
		de.setNbFaces(6);

		//System.out.println(de.getNom());
		
		De de2 = new De();
		System.out.println(de2.getNbFaces());
		
		De de3 = new De(7 , "Hi");
		System.out.println(de3.getNbFaces());
		
		System.out.println(de3.lancer(10));
		System.out.println(de3.nombreDeDes);

	}

}
