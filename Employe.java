package Personnel;
import java.util.Calendar;

import java.util.GregorianCalendar;

public class Employe extends Personne {
	
	double salaire;
    private final GregorianCalendar dateEmbauche;

    public Employe(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse ,float leSalaire, GregorianCalendar laDateembauche) {
		super(leNom, lePrenom, laDate, lAdresse);
		dateEmbauche = laDateembauche;
		salaire = leSalaire;
		
		// TODO Auto-generated constructor stub
	}
    
    public static Employe createEmploye(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse ,float leSalaire, GregorianCalendar laDateembauche) {
    	Calendar maintenant = new GregorianCalendar();
    	
        int age = maintenant.get(Calendar.YEAR) - laDate.get(Calendar.YEAR);
        if ((laDate.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH))||
        	(laDate.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH)&&
        	laDate.get(Calendar.DAY_OF_MONTH) > maintenant.get(Calendar.DAY_OF_MONTH))){
          age--;
        }
        
    	if(age>=16 && age <=65) {
    		Employe e = new Employe(leNom, lePrenom, laDate, lAdresse , leSalaire, laDateembauche);
    		return e;
    	}
    	
    	else
    		return null;
    				
    
    }
    
    /**
	 * Accesseur
	 * @return retourne la date d'embauche	 
	 */
	public GregorianCalendar getDateEmbauche() {
		return dateEmbauche;
	}
    
    public double augmenterLeSalaire(float pourcentage) {
    	if(pourcentage>=0)
    		return (this.salaire * pourcentage/100);
    	else
    		return salaire;
    	
    }
    
    public int calculAnnuite() {
    	Calendar maintenant = new GregorianCalendar();
    	return maintenant.get(Calendar.YEAR) - this.getDateEmbauche().get(Calendar.YEAR); 	
    }
    
    

	
	

}
