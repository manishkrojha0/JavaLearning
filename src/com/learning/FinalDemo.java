package com.learning;
class A1
{
   final int DAY; // final make the value of variable constant
    public A1()
    {
       // i=10;
        DAY=10;
    }
    public final void show() // final methods cannot be inherited
    {
        System.out.println("in final base");
    }
}
// final class cannot be inherited
class B1 extends  A1
{
//    public void show()
//    {
//
//    }
}
public class FinalDemo {
    public static void main(String[] args) {
        A1 obj=new A1();
    }
}
