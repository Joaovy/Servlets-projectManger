package org.example.servlet;
//imports omitidos

import org.example.Banco;
import org.example.Company;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *Servlet implementation class ListaEmpresasSerlvet
 */
@WebServlet("/listaEmpresas")
public class ListCompanysServlets extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        Banco banco = new Banco();
        List<Company> list = banco.getListCompany();

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Lista de Empresas</h1>");
        out.println("<ul>");
        for (Company company : list) {
            out.println("<li>" + company.getName() + "</li>");
        }
        out.println("<ul>");
        out.println("<a href='index.html'>Voltar</a>");
        out.println("<html><body>");



    }
}