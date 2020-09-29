package Exercice1;
import java.util.*;

public class De {


	//attributs de la classe : string nom et int nombre de face
	int nbFaces;
	String nom;
	static int nombreDeDes = 0;
	private static Random r = new Random();
	
	{ // Constructeur implicite
	  nombreDeDes++;
	}
	 
	
	//Constructeurs 
	
	public De() {
		nbFaces = 6;
		nom = "De"+nombreDeDes;
	}
	
	public De(int nombre) {
		if(nombre >= 3 & nombre<= 120)
			nbFaces = nombre;
		else 
			System.err.print("Erreur");
		nom = "De"+nombreDeDes;
	
	}
	
	public De(int nombre, String name) {
		if(nombre >= 3 & nombre<= 120)
			nbFaces = nombre;
		else 
			System.err.print("Erreur");
		nom = name;
	}
	
	//Getters et Setters
	
	//getter nombre de face
	public int getNbFaces() {
		return nbFaces;
	}
	
	//setter nombre de face
	public void setNbFaces(int nombre) {
		if(nombre >= 3 & nombre<= 120)
			nbFaces = nombre;
		else 
			System.err.print("Erreur ");
					
	}
	
	public String getNom() {
		if(nom == ""|| nom == null)
			return "Erreur";
		else 
			return nom;
	}
	
	public int getNombreDeDes() {
			return nombreDeDes;
	}
	
	
	
	//methode lancer 
	public int lancer() {
		int nbAleatoire = r.nextInt(121);
		return nbAleatoire ;
	}
	
	public int lancer(int nombreDeLancer) {
		int i=0;
		int temps = 0;
		while(i<nombreDeLancer) {	
			
			int nbAleatoire = r.nextInt(121);
			if(temps < nbAleatoire)
				temps = nbAleatoire;
			i++;
		}
		return temps ;
	}
	
	// redefinition de toString                                                              
	public String toString() {
		return " ";
	}
	
	// redefinition de toString
	public boolean equals(De de) {
		boolean is_equal = false;
		if(this.nom == de.nom && this.nbFaces == de.nbFaces)
			is_equal = true;
		return is_equal;
	}
	

	

}
