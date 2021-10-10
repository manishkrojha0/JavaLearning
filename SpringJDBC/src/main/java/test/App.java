package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigJDBC.class);
        StudentDao StudentDao=context.getBean("studentImp", StudentDao.class);
        Student student=new Student();

        //insert
//        Scanner sc=new Scanner(System.in);
//        String personId,LastName,FirstName,Address,city;
//        System.out.println("enter id");
//        personId=sc.next();
//        System.out.println("enter Last name");
//        LastName=sc.next();
//        System.out.println("enter first name");
//        FirstName=sc.next();
//        System.out.println("enter address");
//        Address=sc.next();
//        System.out.println("enter city");
//        city=sc.next();
//
//        student.setPersonID(personId);
//        student.setLastName(LastName);
//        student.setFirstName(FirstName);
//        student.setAddress(Address);
//        student.setCity(city);
//        int r=StudentDao.insert(student);
//        System.out.println(r);

        //update
//        student.setLastName("ojha");
//        student.setFirstName("yashi");
//        int r=StudentDao.change(student);
//        System.out.println(r);

        //delete
//        student.setCity("deharadun");
//        int r= StudentDao.delete(student);
//        System.out.println(r);

        // select
//
//        student= StudentDao.getStudent("456");
//        System.out.println(student);

        /// select all records
        student.setCity("kanpur");
        List<Student> studentList= StudentDao.getAllStudents(student);
        for(Student s:studentList)
        {
            System.out.println(s);
        }


    }
}
