package AnnotationsDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        ctx.registerShutdownHook();
        Example ob= (Example) ctx.getBean("ex");
        System.out.println(ob);
    }
}
