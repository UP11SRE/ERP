package com.example.web.DAO.Implementation;

import com.example.web.DAO.LoginDAO;
import com.example.web.Bean.Employees;
import com.example.web.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoginDAOImpl implements LoginDAO {
    @Override
    public boolean login(Employees emp){
        System.out.print("In imp");
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction t =  session.beginTransaction();
            session.save(emp);
            t.commit();
            return true;
        } catch (HibernateException exception){
            System.out.println(exception.getLocalizedMessage());
            return false;
        }
    }
}
