package CertificateEmbedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
    public static void main(String[] args) {
        Student student= new Student();
        Certificate certificate=new Certificate();
        student.setRoll(44);
        student.setName("Manish");
        certificate.setCourse("Python");
        certificate.setDuration("2 months");
        student.setCertificate(certificate);

        Configuration cfg= new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Certificate.class);

        ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

        SessionFactory sf = cfg.buildSessionFactory(registry);

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(student);
     //   session.save(certificate);

        transaction.commit();


        session.close();
        sf.close();




    }
}
