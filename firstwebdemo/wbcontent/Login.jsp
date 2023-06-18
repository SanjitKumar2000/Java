<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="/html/header.html"/>

<form action="LoginServelet" method="post">
	Enter User id : <input type="text" name="userid" /><br><br>
	Enter Password : <input type="password" name="pass" /><br><br>
	<input type="submit" name="sub" value="Login" /><br><br>
	<input type="reset" name="reset" value="Reset" /><br><br>
</form>

</body>
</html>