package Exercice1;

public class DePipe extends De {
	
	int borneMinimale;
	
	//constructeurs
	public DePipe() {
		super();
		borneMinimale = 3;
	}

	public DePipe(int nombre, int b_min) {
		super(nombre);
		borneMinimale = b_min;
				
	}
	
	public DePipe(int nombre, String nom, int b_min) {
		super(nombre,nom);
		borneMinimale = b_min;			
	}
	
	
	//getter 
	public int getBorneMinimale() {
		if(borneMinimale >= 3 & borneMinimale<= 120)
			return borneMinimale;
		else 
		{
			System.err.print("Erreur ");
			return -1;
		}
	}
	
	
}
