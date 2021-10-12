package HotelMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.*;
public class Test {
    public static void main(String[] args) {
//        List<Customer> customers= new ArrayList<Customer>();
//        List<Room> rooms = new ArrayList<Room>();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no of customers entering the hotel");
        int n=sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
            Customer customer=new Customer();
            Room room = new Room();
           // System.out.println("enter the record of"+i+1+"customer");
            System.out.println("enter the customer id");
            String customerId= sc.next();
            customer.setCid(customerId);
            System.out.println("enter the customer name");
            String customer_name=sc.next();
            customer.setCname(customer_name);
            System.out.println("enter the customer address");

            String adddress =sc.next();
            customer.setAddress(adddress);
            System.out.println("enter the room id of customer");
            room.setRoomid(sc.nextInt());
            System.out.println("enter the no of room");
            room.setNo_of_rooms(sc.next());
            customer.setRoom(room);
//            customers.add(customer);
//            rooms.add(room);
      //  }
        System.out.println("enter the order details");
        FoodOrder foodOrder=new FoodOrder();
        System.out.println("enter the food order id");
        String oid=sc.next();
        foodOrder.setOrderId(oid);
        System.out.println("enter the food ");
        String food=sc.next();
        foodOrder.setFood(food);
        System.out.println("enter the price");
        int price= sc.nextInt();
        foodOrder.setPrice(price);

//        foodOrder.setCustomer(customer);

        Configuration con = new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Customer.class).addAnnotatedClass(Room.class).addAnnotatedClass(FoodOrder.class);

        ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();


        SessionFactory sf= con.buildSessionFactory(serviceRegistry);

        Session session= sf.openSession();

        Transaction transaction= session.beginTransaction();

        session.save(room);
        session.save(customer);
        session.save(foodOrder);

        transaction.commit();
        session.close();

    }
}
