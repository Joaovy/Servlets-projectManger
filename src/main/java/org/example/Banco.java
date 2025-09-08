package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Company> listCompany = new ArrayList<>();


    public void add(Company company) {
        listCompany.add(company);
        System.out.println("Empresa " + company.getName() + " adicionada com sucesso!");
    }

    public List<Company> getListCompany(){
        return Banco.listCompany;
    }

}
