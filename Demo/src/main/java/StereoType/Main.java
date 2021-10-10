package StereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getCity());
        System.out.println(student.getClass());
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass().getTypeName());
        Student student1=(Student) ctx.getBean("student");
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }

}
