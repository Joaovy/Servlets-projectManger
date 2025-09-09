package org.example.servlet;
//imports omitidos

import org.example.Banco;
import org.example.Company;

import javax.servlet.RequestDispatcher;
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

        request.setAttribute("companys", list);

        RequestDispatcher rd = request.getRequestDispatcher("/listCompany.jsp");
        rd.forward(request, response);

    }
}