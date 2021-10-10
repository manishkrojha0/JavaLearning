package HibDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryRegistry;
import org.hibernate.service.ServiceRegistry;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID("151");
        student.setFirstName("Ramesh");
        student.setLastName("Bangali");
        student.setAddress("bh-3");
        student.setCity("Bengal");
        Configuration con =new Configuration().configure("META-INF/hibernate.cfg.xml").addAnnotatedClass(Student.class);

        //ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

      //  ServiceRegistry serviceRegistry= new ServiceRegistryBuilder().applySettings(con.getProperties()).builderServiceRegistry();

        SessionFactory sf= con.buildSessionFactory();

        Session session=sf.openSession();

        Transaction tx= session.beginTransaction();

        session.save(student);

        tx.commit();
    }
}
