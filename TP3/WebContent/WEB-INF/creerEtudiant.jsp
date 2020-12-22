<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <c:import url="/inc/inc_link.jsp" />
	<%-- Formuliare de l'étudiant --%>
		
		<form method="post" action="<c:url value="/creerEtudiant"/>"> 	
		<fieldset>
			<legend style="color:blue;">Information Etudiant</legend>
		
		<label for="numApogee">Num Apogee</label>
		<input type="text" id="numApogee" name="numApogee" size="30" maxlength="30" value="<c:out value="${etudiant.num_Apogee}"/>"   />
		<span class="erreur">${form.erreurs['numApogee']}</span>
		<br />

		<label for="nomEtudiant">Nom</label>
		<input type="text" id="nomEtudiant" name="nomEtudiant" size="30" maxlength="30"  value="<c:out value="${etudiant.nom}"/>" />
		<span class="erreur">${form.erreurs['nomEtudiant']}</span>
		<br />
    
		<label for="prenomEtudiant">Prenom</label>
		<input type="text" id="prenomEtudiant" name="prenomEtudiant" size="30" maxlength="60" value="<c:out value="${etudiant.prenom}"/>"  />
		<span class="erreur">${form.erreurs['prenomEtudiant']}</span>
		<br />

		<label for="telephoneClient">Numéro de téléphone</label>
		<input type="text" id="telephoneClient" name="telephoneEtudiant" size="30" maxlength="30" value="<c:out value="${etudiant.numeroTel}"/>"  />
		<span class="erreur">${form.erreurs['telephoneEtudiant']}</span>
		<br />
		
		<label for="emailEtudiant">Adresse email</label>
		<input type="text" id="emailClient" name="emailEtudiant" size="30" maxlength="60" value="<c:out value="${etudiant.adresseEmail}"/>"  />
		<span class="erreur">${form.erreurs['emailEtudaint']}</span>
		<br />
		
		<label for="filiereEtudiant">Filiere</label>
		<input type="text" id="filiereEtudiant" name="filiereEtudiant" size="30" maxlength="60" value="<c:out value="${etudiant.filiere}"/>"  />
		<span class="erreur">${form.erreurs['filiereEtudiant']}</span>
		<br />
		  
			<input type="submit" value="Valider">
			<input type="reset" value="Réinitialiser">
		 
		
		
		</fieldset>
		 </form> 
</body>
</html>