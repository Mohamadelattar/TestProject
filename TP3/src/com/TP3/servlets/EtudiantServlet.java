package com.TP3.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TP3.beans.Etudiant;
import com.TP3.services.CreationEtudiantForm;

public class EtudiantServlet extends HttpServlet {

			private static final long serialVersionUID = 1L;
	
		    public static final String ATT_ETUDIANT = "etudiant";
		    public static final String ATT_FORM   = "form";

		    public static final String VUE_SUCCES = "/WEB-INF/afficherEtudiant.jsp";
		    public static final String VUE_FORM   = "/WEB-INF/creerEtudiant.jsp";

		    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		        
		        this.getServletContext().getRequestDispatcher( VUE_FORM ).forward( request, response );
		    }

		    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		        
		        CreationEtudiantForm form = new CreationEtudiantForm();

		        
		        Etudiant etudiant = form.creerEtudiant( request );

	 
		        request.setAttribute( ATT_ETUDIANT, etudiant );
		        request.setAttribute( ATT_FORM, form );

		        if ( form.getErreurs().isEmpty() ) {
		            
		            this.getServletContext().getRequestDispatcher( VUE_SUCCES ).forward( request, response );
		        } else {
		            
		            this.getServletContext().getRequestDispatcher( VUE_FORM ).forward( request, response );
		        }
		    }

	}


