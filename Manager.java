package Personnel;

import java.util.GregorianCalendar;

public class Manager extends Employe{
	Secretaire secretaire;

	public Manager(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, float leSalaire,
			GregorianCalendar laDateembauche, Secretaire laSecretaire) {
		super(leNom, lePrenom, laDate, lAdresse, leSalaire, laDateembauche);
		this.secretaire = laSecretaire;
		
	}
	
	public double augmenterLeSalaire(double pourcentage) {
		
    	if(pourcentage>=0)
    		return (this.salaire * (pourcentage + 0.5*this.calculAnnuite()) /100);
    	else
    		return salaire;
    	
    }
	
	public void modifierSecretaire(Secretaire laSecretaire) {
		secretaire = laSecretaire;
		
	}

	

}
