package HotelMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Room room= new Room();
        room.setRoomid(199);
        room.setNo_of_rooms("4bhk");

        Customer customer=new Customer();
        customer.setCid("480");
        customer.setCname("Deepika");
        customer.setAddress("Delhi");
        customer.setRoom(room);
        room.setCustomer(customer);

        FoodOrder order1= new FoodOrder();
        order1.setOrderId("221");
        order1.setFood("Kadhai Paneer");
        order1.setPrice(748);
        order1.setCustomer(customer);

        FoodOrder order2 = new FoodOrder();
        order2.setOrderId("302");
        order2.setFood("Lababdar Paneer");
        order2.setPrice(532);
        order2.setCustomer(customer);

        FoodOrder order3 = new FoodOrder();
        order3.setOrderId("278");
        order3.setFood("Butter Roti");
        order3.setPrice(102);
        order3.setCustomer(customer);

        List<FoodOrder> foodOrders=new ArrayList<>();

        foodOrders.add(order1);
        foodOrders.add(order2);
        foodOrders.add(order3);

        customer.setFoodOrders(foodOrders);

        Configuration con = new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Room.class).addAnnotatedClass(Customer.class).addAnnotatedClass(FoodOrder.class);

        ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf =con.buildSessionFactory(registry);

        Session session = sf.openSession();

        Transaction transaction= session.beginTransaction();

//        session.save(room);
        session.save(customer);
//        session.save(order1);
//        session.save(order2);
//        session.save(order3);

        transaction.commit();

        session.close();
        sf.close();
    }


}
