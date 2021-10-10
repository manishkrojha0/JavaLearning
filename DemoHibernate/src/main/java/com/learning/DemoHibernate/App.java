package com.learning.DemoHibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
    public static void main(String args[]) {
        Alien telusko = new Alien();
        telusko.setAid(102);
        telusko.setAname("Shaktiman");
        telusko.setColor("Dark Red");

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
       // ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).getBootstrapServiceRegistry();
        SessionFactory sf = con.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(telusko);
        tx.commit();
    }

}