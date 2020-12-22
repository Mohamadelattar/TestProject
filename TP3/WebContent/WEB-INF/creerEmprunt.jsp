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
		<form method="post" action="<c:url value="/creerEmprunt"/>"> 	
		<fieldset>
			<legend style="color:blue;">Information Emprunt</legend>	
			<label for="ref">Référence</label>
			<input type="text" id="ref" name="ref" value="<c:out value="${emprunt.refLivre}"/>" size="30" maxlength="30" />
			<span class="erreur">${form.erreurs['ref']}</span>
			<br>
			
			<label for="date">Date</label>
			<input type="text" id="date" name="date" value="<c:out value="${emprunt.dateEmprunt}"/>" size="30" maxlength="30" />
			<span class="erreur">${form.erreurs['date']}</span>
			<br>
			<label for="periode">Periode</label>
			<input type="text" id="periode" name="periode" value="<c:out value="${emprunt.periode}"/>" size="30" maxlength="30" />
			<span class="erreur">${form.erreurs['periode']}</span>
			<br>
			<br />
		  
			<input type="submit" value="Valider">
			<input type="reset" value="Réinitialiser">
			</fieldset>
			</form>
</body>
</html>