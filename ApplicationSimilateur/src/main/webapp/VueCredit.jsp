<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="controleur.php" method="post">
<table>
<tr><td>Montant</td><td><input type="text" name="montant"  ></td></tr>
<tr><td>Mois</td><td><input type="text" name="mois"></td></tr>
<tr><td>Taux</td><td><input type="text" name="taux"  ></td></tr>
<tr><td></td><td><input type="submit" name="action" value="Calculer"></td></tr>
</table>
</form>
<h1>mensualitte est: ${credit.mensuelle }</h1>
</body>
</html>