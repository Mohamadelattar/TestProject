package com.TP3.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.TP3.beans.Emprunt;
import com.TP3.services.CreationEmpruntForm;


public class EmpruntServlet extends HttpServlet {

	public EmpruntServlet() {
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;
	
    public static final String ATT_EMPRUNT = "emprunt";
    public static final String ATT_FORM   = "form";

    public static final String VUE_SUCCES = "/WEB-INF/afficherEmprunt.jsp";
    public static final String VUE_FORM   = "/WEB-INF/creerEmprunt.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        
        this.getServletContext().getRequestDispatcher( VUE_FORM ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        
        CreationEmpruntForm form = new CreationEmpruntForm();

        
        Emprunt emprunt = form.creerEmprunt( request );


        request.setAttribute( ATT_EMPRUNT, emprunt );
        request.setAttribute( ATT_FORM, form );

        if ( form.getErreurs().isEmpty() ) {
            
            this.getServletContext().getRequestDispatcher( VUE_SUCCES ).forward( request, response );
        } else {
            
            this.getServletContext().getRequestDispatcher( VUE_FORM ).forward( request, response );
        }
    }

}
