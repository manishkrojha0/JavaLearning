package com.learning;
/*
Types of interface
1. Normal - more than 1 method
2. Single method-functional interface- lamda expression - Scala
3. Marker method- no methods
Abstract class -> we declare and define method
Interface -> declare ->1.7
1.8 can define methods
 */
interface Demo
{
    void abc();
    default void show()
    {
        System.out.println("in show");
    }
}
interface myDemo
{
    default void show()
    {
        System.out.println("in MyDemoshow");
    }
}
class  DemoImp implements Demo , myDemo
{
    public void abc()
    {
        System.out.println("inDemoimp");
    }
    @Override
    public void show()
    {
        System.out.println("in Demoimpshow");
        myDemo.super.show();
    }
}
interface Abc
{
    void show();
}
public class InterfaceType {
    public static void main(String[] args) {
        Abc obj= new Abc()
                {
                    public void show()
                    {
                        System.out.println("I am the best");
                    }
                };
        Abc obj1= () -> System.out.println("manish"); //lamda expression
        obj1.show();
        Demo ob1= new DemoImp();
        ob1.abc();
        ob1.show();
    }
}
