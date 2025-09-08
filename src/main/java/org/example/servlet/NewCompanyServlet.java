package org.example.servlet;

import org.example.Banco;
import org.example.Company;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NewCompanyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("Cadastrando nova empresa");
        PrintWriter out = response.getWriter();

        String nameCompany = request.getParameter("nome");
        Company company = new Company();
        company.setName(nameCompany);

        Banco banco = new Banco();
        banco.add(company);

        out.println("<html><body>EMPRESA CADASTRADA COM SUCESSO</body></html>");
        out.println("<html><body>EMPRESA = "+ nameCompany +"</body></html>");



    }
}