package org.example;

import org.apache.catalina.startup.Tomcat;
import org.example.HelloServlet;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        int port = 8080;
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(port);

        String webappDirLocation = new File("src/main/resources").getAbsolutePath();
        var context = tomcat.addWebapp("", webappDirLocation);

        // Registra o servlet manualmente
        tomcat.addServlet("", "helloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "helloServlet");

        tomcat.getConnector();
        tomcat.start();
        System.out.println("Servidor rodando em http://localhost:" + port);
        tomcat.getServer().await();
    }
}