<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, org.example.Company"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="pt-BR">
<head>
    <meta charset="ISO-8859-1">
    <title>Página de nova empresa </title>
</head>
<body>
    <ul>
      <c:forEach var="empresa" items="${companys}">
          <li>${empresa.name}</li>
      </c:forEach>
    </ul>
</body>
</html>

