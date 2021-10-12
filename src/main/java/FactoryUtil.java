import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public  class FactoryUtil {
    public static SessionFactory sf;
    public static SessionFactory getFactory()
    {
        if(sf==null)
        {
            sf= new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
            return sf;
        }
        return null;
    }
    public static void doClose()
    {
        if(sf.isOpen())
        {
            sf.close();
        }
    }
}
