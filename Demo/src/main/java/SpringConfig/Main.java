package SpringConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(Student.class);
        Student student= (Student) ctx.getBean("student");
        System.out.println(student);
    }
}
