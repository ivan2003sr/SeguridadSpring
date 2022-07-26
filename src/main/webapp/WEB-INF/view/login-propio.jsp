<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2 style="text-align:center">Página de login</h2>

<form:form action="${pageContext.request.contextPath }/autenticacionUsuario" method="POST">
 
<p>
Usuario: <input type="text" name="username"/>
</p>

<p>
Password: <input type="password" name="password"/>
</p>

<input type="submit" value="Login"/>


</form:form>



</body>
</html>