package CompanyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Company company=new Company();
        company.setCid(786);
        company.setCname("Amazon");
        company.setAddress("Bangalore");

        ////////UPDATING AND CREATING TABLE
        employee.setEid(786);
        employee.setEname("Amit");
        employee.setAddress("Mumbai");
        employee.setSalary(60000);
        employee.setCompany(company);

        Configuration con= new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Employee.class);

        ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf= con.buildSessionFactory(registry);
        Session session= sf.openSession();
        Transaction tx= session.beginTransaction();

        // save method is for saving values table
//        session.save(employee);

        /// fetching info from table
//        employee = (Employee) session.get(Employee.class,780);
//        System.out.println(employee);
        tx.commit();
    }
}
