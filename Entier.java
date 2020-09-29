package Exercice2;

public class Entier {
	int valeur;
	int born_inf;
	int born_sup;
	
	public Entier() {
		valeur = 0;
		
	}
	
	public Entier(int val , int born_inferieur , int born_superieur) {
		if(val>= born_inferieur && val <= born_superieur)
			valeur = val;
		
	}
	
	public void setVal(int val) {
		if(val>= born_inf && val <= born_sup)
			valeur = val;	
	}
	
	public int getVal() {
		return valeur;
		
	}
	
	public int incremente() {
		int retour = valeur;
		
		if(valeur++>= born_inf && valeur++ <= born_sup)
			retour = valeur++;
		return retour;
		
	}
	
	public int incremente(int n) {
		int retour = valeur;
		int comp = valeur +n;
		
		if(comp>= born_inf && comp<= born_sup)
			retour = comp;
		return retour;
		
	}
	
	public String toString() {
		return ("La valeur de l'entier est:" + valeur + ". Il est comprit entre " + born_inf  + " et " + born_sup); 
	}
	
	@Override
	public boolean equals(Object entier) {
		return (this.valeur == ((Entier)entier).getVal());
		
	}
	

}
