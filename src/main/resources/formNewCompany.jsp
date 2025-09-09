<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>
<%@ page import="java.util.List, org.example.Company"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="pt-BR">
<head>
    <meta charset="ISO-8859-1">
    <title>Página de nova empresa </title>
</head>
<body>
    <form action="${linkServletNovaEmpresa}" method="post">

        Nome: <input type="text" name="name" />

        <input type="submit" value="Cadastrar" />
    </form>
</body>
</html>

