package CompanyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        ///setting data in company
        Company company=new Company();
        company.setCid(187);
        company.setCname("Google");

        ////////Setting list of employees
        Employee employee=new Employee();
        employee.setEid(998);
        employee.setEname("Roshini");
        employee.setCompany(company);

        Employee employee1 = new Employee();
        employee1.setEname("Aniket");
        employee1.setEid(335);
        employee1.setCompany(company);

        Employee employee2 = new Employee();
        employee2.setEid(559);
        employee2.setEname("Ritam");
        employee2.setCompany(company);



        List<Employee> employees=new ArrayList<Employee>();

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);

        company.setEmployees(employees);



        Configuration con= new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Company.class).addAnnotatedClass(Employee.class );

        ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf= con.buildSessionFactory(registry);
        Session session= sf.openSession();
        Transaction tx= session.beginTransaction();

        session.save(company);
        session.save(employee);
        session.save(employee1);
        session.save(employee2);

        tx.commit();

        session.close();
        sf.close();
    }
}
