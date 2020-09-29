package Personnel;

import java.util.GregorianCalendar;

public class Secretaire extends Employe  {
	Manager [] manager;

	public Secretaire(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, float leSalaire,
			GregorianCalendar laDateembauche) {
		super(leNom, lePrenom, laDate, lAdresse, leSalaire, laDateembauche);
		// TODO Auto-generated constructor stub
	}
	
	
	public double augmenterLeSalaire(double pourcentage) {
		
    	if(pourcentage>=0)
    		return (this.salaire * (pourcentage + 0.1*manager.length) /100);
    	else
    		return salaire;
    	
    }
	
	public void modifierManager(Manager leManageur, int position) {
		manager[position] = leManageur;
		
	}
	

}
