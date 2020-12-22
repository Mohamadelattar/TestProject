package com.TP3.beans;

public class Emprunt {
	
	public String refLivre;
	public String dateEmprunt;
	public String periode;
	
	

	public Emprunt(String refLivre, String dateEmprunt, String periode) {
		super();
		this.refLivre = refLivre;
		this.dateEmprunt = dateEmprunt;
		this.periode = periode;
	}



	public String getRefLivre() {
		return refLivre;
	}



	public void setRefLivre(String refLivre) {
		this.refLivre = refLivre;
	}



	public String getDateEmprunt() {
		return dateEmprunt;
	}



	public void setDateEmprunt(String dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}



	public String getPeriode() {
		return periode;
	}



	public void setPeriode(String periode) {
		this.periode = periode;
	}



	public Emprunt() {
		// TODO Auto-generated constructor stub
	}

}
