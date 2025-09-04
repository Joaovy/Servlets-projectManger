package org.example.servlet;

import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String nome = req.getParameter("nome");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("<h2>Olá, " + (nome != null ? nome : "visitante") + "!</h2>");
        System.out.println("Requisição recebida de " + req.getRemoteAddr());
    }
}