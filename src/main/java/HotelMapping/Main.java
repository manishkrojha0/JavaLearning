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
        Room room=new Room();
        Customer customer=new Customer();
        FoodOrder foodOrder=new FoodOrder();

        room.setRoomid(601);
        room.setNo_of_rooms("4bhk");

        customer.setCid("152");
        customer.setCname("Ritesh");
        customer.setAddress("Delhi");
        customer.setRoom(room);

        ////first order

        foodOrder.setOrderId("105");
        foodOrder.setFood("Kadhai Panner");
        foodOrder.setPrice(600);
//        foodOrder.setCustomer(customer);

        /// Second Order

        FoodOrder foodOrder1=new FoodOrder();
        foodOrder1.setOrderId("106");
        foodOrder1.setFood("Chapati");
        foodOrder1.setPrice(600);
//        foodOrder1.setCustomer(customer);

        List<FoodOrder> foodOrders=new ArrayList<FoodOrder>();

        foodOrders.add(foodOrder);
        foodOrders.add(foodOrder1);

        ////  Adding order to customer

        customer.setFoodOrders(foodOrders);


        Configuration con = new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Room.class).addAnnotatedClass(Customer.class).addAnnotatedClass(FoodOrder.class);

        ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf =con.buildSessionFactory(registry);

        Session session = sf.openSession();

        Transaction transaction= session.beginTransaction();

        session.save(room);
        session.save(customer);
        session.save(foodOrder);

        transaction.commit();

        session.close();
        sf.close();
    }


}
