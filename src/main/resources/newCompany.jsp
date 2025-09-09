<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String nomeEmpresa = (String)request.getAttribute("company");
%>

<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Página de nova empresa </title>
</head>
        <body>
                Empresa <%= nomeEmpresa %> cadastrada com sucesso!
        </body>
</html>


