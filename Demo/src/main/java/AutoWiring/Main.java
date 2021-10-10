package AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        emp e1=(emp) ctx.getBean("e1");
        System.out.println(e1);
    }
}
