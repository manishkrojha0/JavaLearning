package StandAlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        Persons p1= (Persons) ctx.getBean("p1");
        System.out.println(p1);
    }
}
