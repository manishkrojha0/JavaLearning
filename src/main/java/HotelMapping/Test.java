package HotelMapping;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.Query;
import java.util.*;
public class Test {
    public static void main(String[] args) {



        Configuration con = new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Customer.class).addAnnotatedClass(Room.class).addAnnotatedClass(FoodOrder.class);

        ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();


        SessionFactory sf= con.buildSessionFactory(serviceRegistry);

        Session session= sf.openSession();

        //Transaction transaction= session.beginTransaction();

        String query= "from Customer";

        Query q= session.createQuery(query);

        List<Customer> customers= q.getResultList();

        for(Customer c:customers)
        {
            System.out.println(c.getCname()+c.getAddress());
        }

        //transaction.commit();
        session.close();


        Session session1=sf.openSession();

        String query1= "from Customer";

        Query q1= session1.createQuery(query1);

        List<Customer> customers1= q1.getResultList();

        for(Customer c:customers1)
        {
            System.out.println(c.getCname());
        }

        session1.close();

        Session session2= sf.openSession();

        Criteria criteria= session2.createCriteria(Customer.class);

        criteria.add(Restrictions.eq("cname", "Deepak"));

        List customers2= criteria.list();

        for(Object c: customers2)
        {
            System.out.println(c);
        }
        session2.close();
        sf.close();
    }
}
