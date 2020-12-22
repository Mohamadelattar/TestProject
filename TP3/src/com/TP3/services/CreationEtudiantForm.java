package com.TP3.services;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.TP3.beans.Etudiant;

public class CreationEtudiantForm {
	
	public static final String CHAMP_NUM_APOGEE= "numApogee";
    public static final String CHAMP_NOM       = "nomEtudiant";
    public static final String CHAMP_PRENOM    = "prenomEtudiant";
    public static final String CHAMP_TELEPHONE = "telephoneEtudiant";
    public static final String CHAMP_EMAIL     = "emailEtudaint";
    public static final String CHAMP_FILIERE   = "filiereEtudiant";
   
    private String resultat;
    private Map<String, String> erreurs = new HashMap<String, String>();

    public String getResultat() {
    	
    	return resultat;
    	
    }
    	
   public Map<String, String> getErreurs() {
   
	   return erreurs;
    	
   }

    
   

	public CreationEtudiantForm() {
		// TODO Auto-generated constructor stub
	}
	
	private void setErreur( String champ, String message ) {
	    erreurs.put( champ, message );
	}
	public Etudiant creerEtudiant( HttpServletRequest request ){
		
		String numApogee = request.getParameter(CHAMP_NUM_APOGEE);
        String nom = request.getParameter( CHAMP_NOM );
        String prenom = request.getParameter( CHAMP_PRENOM );
        String telephone = request.getParameter( CHAMP_TELEPHONE );
        String email = request.getParameter( CHAMP_EMAIL );
        String filiere = request.getParameter(CHAMP_FILIERE);
        
        Etudiant etudiant = new Etudiant();
        try {
        	validationNumApogee( numApogee );
        } catch ( Exception e ) {
        setErreur( CHAMP_NUM_APOGEE, e.getMessage() );
        }
        etudiant.setNum_Apogee(numApogee);
        
        try {
        	validationNom(nom);
        }catch(Exception e) {
        	setErreur( CHAMP_NOM, e.getMessage() );
        }
        etudiant.setNom(nom);
        
        try {
        	validationPrenom(prenom);
        }catch(Exception e) {
        	setErreur( CHAMP_PRENOM, e.getMessage() );
        }
        etudiant.setPrenom(prenom);
        
        try {
        	validationTelephone(telephone);
        }catch(Exception e) {
        	setErreur( CHAMP_TELEPHONE, e.getMessage() );
        }
        etudiant.setPrenom(telephone);
        
        try {
        	validationTelephone(telephone);
        }catch(Exception e) {
        	setErreur( CHAMP_TELEPHONE, e.getMessage() );
        }
        etudiant.setPrenom(telephone);
        
        try {
        	validationEmail(email);
        }catch(Exception e) {
        	setErreur( CHAMP_EMAIL, e.getMessage() );
        }
        etudiant.setPrenom(email);
        
        try {
        	validationEmail(filiere);
        }catch(Exception e) {
        	setErreur( CHAMP_FILIERE, e.getMessage() );
        }
        etudiant.setPrenom(filiere);
        
        return etudiant;
	}

	public void validationNumApogee(String numApogee) throws Exception
	{
		if(numApogee.length()<2) {
			throw new Exception("Merci de saisir un num apogee contiant au moins 3 lettre");
		}
	}
	
	public void validationNom(String nom) throws Exception
	{
		if(nom.length()<2) {
			throw new Exception("Merci de saisir un nom contiant au moins 3 lettre");
		}
	}

	public void validationPrenom(String prenom) throws Exception
	{
		if(prenom.length()<2) {
			throw new Exception("Merci de saisir un prenom contiant au moins 3 lettre");
		}
	}
	
	public void validationTelephone(String telephone) throws Exception
	{
		if(telephone != null) {
			if(telephone.length() > 10)
			{
				if(!telephone.matches("[-+]?\\d*\\.?\\d+") )
					throw new Exception("Merci de saisir un numero de telephone contient que les nombres");
			}
			else
			{
				throw new Exception("Merci de saisir un numero contient au moins 10 nombres");
			}
			
		}
		else
		{
			throw new Exception("Merci de saisir un numero de telephone ");
		}
	}
	
	private void validationEmail( String email ) throws Exception {
	    if ( email != null ) {
	        if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
	            throw new Exception( "Merci de saisir une adresse mail valide." );
	        }
	    } else {
	        throw new Exception( "Merci de saisir une adresse mail." );
	    }
	}
	
	public void validationFiliere(String filiere) throws Exception
	{
		if(filiere.length()<2) {
			throw new Exception("Merci de saisir une filiere   contiant au moins 2 lettre");
		}
	}
	
}
