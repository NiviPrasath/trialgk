<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Emi" method="Post"> 
<br><br>Enter The Principal Amount:<input name="principal" type="number"/><br><br>
Enter Rate:<input name="rate" type="number"/><br><br>
Enter Total Number Of Years:<input name="time" type="number"/><br><br><br>
<input type="submit"/>  </form>
Monthly EMI is = ${EMI}
</body>
</html>