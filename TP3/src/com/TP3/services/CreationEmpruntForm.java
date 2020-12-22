package com.TP3.services;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import com.TP3.beans.Emprunt;

public class CreationEmpruntForm {
	
	public static final String CHAMP_REF   = "ref";
    public static final String CHAMP_DATE   = "date";
    public static final String CHAMP_PERIODE   = "periode";
	public CreationEmpruntForm() {
		// TODO Auto-generated constructor stub
	}
	
	 private String resultat;
	 private Map<String, String> erreurs = new HashMap<String, String>();
	
	public String getResultat() {
    	
    	return resultat;
	
    }
    	
   public Map<String, String> getErreurs() {
   
	   return erreurs;
    	
   }
   
   private void setErreur( String champ, String message ) {
	    erreurs.put( champ, message );
	}
   
	public Emprunt creerEmprunt ( HttpServletRequest request )
	{
		String refLivre = request.getParameter(CHAMP_REF);
        String dateEmprunt = request.getParameter(CHAMP_DATE);
        String periode = request.getParameter(CHAMP_PERIODE);
        
        Emprunt emprunt = new Emprunt();
        
        try {
        	validationRefLivre( refLivre );
        } catch ( Exception e ) {
        setErreur( CHAMP_REF, e.getMessage() );
        }
        emprunt.setRefLivre(refLivre);
        emprunt.setDateEmprunt(dateEmprunt);
		
        try {
        	validationPeriode(periode);
        } catch (Exception e) {
        	setErreur( CHAMP_PERIODE, e.getMessage() );
        }
        
        return emprunt;
	}

	 

	private void validationPeriode(String periode) throws Exception {
		if(!periode.equals("7") && !periode.equals("15")) {
			throw new Exception("Merci de saisir 7 ou 15 comme periode");
		}

		
	}

	public void validationRefLivre(String refLivre) throws Exception {
		if(refLivre.length()<2) {
			throw new Exception("Merci de saisir un reference de Livre contient au moins 2 lettre");
		}
		
	}
}
