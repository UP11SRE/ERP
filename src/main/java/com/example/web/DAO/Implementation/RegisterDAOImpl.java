package com.example.web.DAO.Implementation;

import com.example.web.DAO.RegisterDAO;
import com.example.web.Bean.Employees;
import com.example.web.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RegisterDAOImpl implements RegisterDAO {

    @Override
    public boolean register(Employees emp) {
        System.out.println("Int DAO impl");
        try (Session session = HibernateSessionUtil.getSession()){
            Transaction t = session.beginTransaction();
            session.save(emp);
            t.commit();
            return true;
        } catch (HibernateException exception){
            System.out.println(exception.getLocalizedMessage());
            return false;
        }
    }
}

