package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        A ob1 = (A)ctx.getBean("aref1");
        A ob2 = (A) ctx.getBean("aref2");
        A ob3 =(A) ctx.getBean("aref3");
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
    }


}
