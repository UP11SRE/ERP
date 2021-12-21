package com.example.web.Service;

import com.example.web.DAO.Implementation.RegisterDAOImpl;
import com.example.web.Bean.Employees;

public class registerService {
    RegisterDAOImpl registerDAO = new RegisterDAOImpl();
    public boolean register(Employees emp){

        System.out.println("in service");
        return  registerDAO.register(emp);
    }
}

