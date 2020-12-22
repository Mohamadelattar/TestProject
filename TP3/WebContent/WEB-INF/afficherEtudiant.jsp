<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Affichage</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/inc/style.css"/>" />
</head>
<body>
	<%-- Avec JSP  --%>
<div class="shade">
	<div class="blackboard">
		<div class="form">
		<p>Num Apogge :${etudiant.num_Apogee }</p>
		<p>Nom : ${etudiant.nom }</p>
		<p>Prenom : ${etudiant.prenom }</p>
		<p>Num de Tel : ${etudiant.numeroTel}</p>
		<p>Adresse Email : ${etudiant.adresseEmail}</p>
		<p>Filiere : ${etudiant.filiere}</p>
		</div>
	</div>
</div>

	

</body>
</html>