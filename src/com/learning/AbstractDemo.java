package com.learning;
import com.learning.test. *;
abstract class human
{
    public abstract void eat()   // abstract method must have abstrct class
    ;

    public void walk()
    {

    }
}
class man extends human  // Concrete class
{
    public void eat()
    {

    }
    public static void data(Number i)
    {
        System.out.println(i);
    }
}
public class AbstractDemo extends animal
{
    public static void main(String[] args) {
        man obj=new man();
        man.data(9);

    }
}
