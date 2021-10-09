package com.learning.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testref {
	public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("com/learning/ref/Reftest.xml");
         A ob1= (A) context.getBean("aref");
         System.out.println(ob1);
	}
  

}
