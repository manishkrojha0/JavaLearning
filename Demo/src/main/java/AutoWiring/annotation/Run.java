package AutoWiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        A a1= (A) ctx.getBean("a1");
        System.out.println(a1);
    }
}
