package com.learning;
/*
Interface - we can achieve multiple inheritance in java through interface.
In interface every methods are abstract by default
In this we don't define the methods.
we can derive the base class as implements
we can create reference of interface but not object.
 */

interface writer
{
    public void write() ;
    public void show();

}
class pen implements writer
{
    public void write()
    {
        System.out.println("I am a pen");
    }

    @Override
    public void show() {

    }
}
class pencil implements writer
{
    public void write()
    {
        System.out.println("I am a pencil");
    }
    @Override
    public void show()
    {

    }
}
class kit
{
    public void doSomething(writer ob)
    {
        ob.write();
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        writer ob=new pencil();
        kit obj=new kit();
        ob=new pen();
        obj.doSomething(ob);
    }
}
