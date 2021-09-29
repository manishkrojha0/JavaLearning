package com.learning;
/*
Whenever we create variable in interface it automatically becomes final or constant

 */
interface Demo1
{
   int num=9;
    void abc();
    static void show()
    {
        System.out.println("hi");
    }
}
class demoImp1 implements Demo1
{
    public void abc()
    {
       // num=9;
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Demo1.show();
    }
}
