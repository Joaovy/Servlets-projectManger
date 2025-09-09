<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, org.example.Company"%>
<html lang="pt-BR">
<head>
    <meta charset="ISO-8859-1">
    <title>Página de nova empresa </title>
</head>
<body>
    <ul>
        <%
            List<Company> lista = (List<Company>) request.getAttribute("companys");
            for (Company empresa : lista) {
        %>
            <li><%= empresa.getName() %></li>
        <%
                }
        %>
    </ul>
</body>
</html>