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
        company.setCid(789);
        company.setCname("Microsoft");

        ////////Setting list of employees
        Employee employee=new Employee();
        employee.setEid(780);
        employee.setEname("Amit");
        employee.setCompany(company);

        Employee employee1 = new Employee();
        employee1.setEname("Manish");
        employee1.setEid(879);
        employee1.setCompany(company);

        Employee employee2 = new Employee();
        employee.setEid(659);
        employee2.setEname("Raman");
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

        tx.commit();

        session.close();
        sf.close();
    }
}
