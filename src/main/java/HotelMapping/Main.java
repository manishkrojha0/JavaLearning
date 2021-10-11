package HotelMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
    public static void main(String[] args) {
        Room room=new Room();
        Customer customer=new Customer();
        FoodOrder foodOrder=new FoodOrder();

        room.setRoomid(600);
        room.setNo_of_rooms("3bhk");

        customer.setCid("151");
        customer.setCname("Ritu");
        customer.setAddress("Delhi");
        customer.setRoom(room);

        foodOrder.setOrderId("104");
        foodOrder.setFood("Sahi Panner");
        foodOrder.setPrice(500);
        foodOrder.getOrder_list().add(customer);

        Configuration con = new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Room.class).addAnnotatedClass(Customer.class).addAnnotatedClass(FoodOrder.class);

        ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf =con.buildSessionFactory(registry);

        Session session = sf.openSession();

        Transaction transaction= session.beginTransaction();

        session.save(room);
        session.save(customer);
        session.save(foodOrder);

        transaction.commit();
    }


}
