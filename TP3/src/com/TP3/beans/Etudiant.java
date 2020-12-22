package com.TP3.beans;

public class Etudiant {
	
	private String num_Apogee;
	private String nom;
	private String prenom;
	private String numeroTel;
	private String adresseEmail;
	private String filiere;

	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String num_Apogee, String nom, String prenom, String numeroTel, String adresseEmail,
			String filiere) {
		super();
		this.num_Apogee = num_Apogee;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroTel = numeroTel;
		this.adresseEmail = adresseEmail;
		this.filiere = filiere;
	}

	public String getNum_Apogee() {
		return num_Apogee;
	}

	public void setNum_Apogee(String num_Apogee) {
		this.num_Apogee = num_Apogee;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public String getAdresseEmail() {
		return adresseEmail;
	}

	public void setAdresseEmail(String adresseEmail) {
		this.adresseEmail = adresseEmail;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	
	

}
