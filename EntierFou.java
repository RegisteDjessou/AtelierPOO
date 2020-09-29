package Exercice2;
import java.util.*;

public class EntierFou extends Entier{
	int niveauDeFolie;
private static Random r = new Random();
	
	public int incremente() {
		int nbAleatoire = r.nextInt(niveauDeFolie + 1);
		if (nbAleatoire>= born_inf && nbAleatoire <= born_sup)
			valeur = nbAleatoire;
		return valeur ;
		
	}

}
