package Personnel;

import java.util.GregorianCalendar;

import Personnel.Adresse;
import Personnel.Personne;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse a= new Adresse(12,"fg","15254","D");
		GregorianCalendar g = 	new GregorianCalendar(2018, 6, 27);
		GregorianCalendar f = 	new GregorianCalendar(2018, 6, 27);
		Personne p = new Personne("Jean","COSSI",g,a);
		
		Personne p2 = new Personne("Jean","COSSI",f,a);
		System.out.print(p.plusAgeeQue(p2));
		System.out.print(p.equals(p));

	}

}
