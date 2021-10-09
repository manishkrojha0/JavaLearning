package com.learning.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testClass {
   public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/learning/collections/CollectionsTest.xml");
	Emp emp1 =(Emp) context.getBean("Emp1");
	System.out.println(emp1);
 }
}
