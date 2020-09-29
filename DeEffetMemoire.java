package Exercice1;
import java.util.*;


public class DeEffetMemoire extends De {

	private static Random r = new Random();
	int ancienneValeur;

	
	public int lancer(int nombreDeLancer) {
		int i=0;
		int temps = 0;
		while(i<nombreDeLancer ) {	
			
			int nbAleatoire = r.nextInt(121);
			if(temps < nbAleatoire)
				temps = nbAleatoire;
			i++;
		} 
		ancienneValeur = temps;
		return temps ;
	}

}
