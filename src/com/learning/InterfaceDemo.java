package com.learning;
/*
Interface - we can achieve multiple inheritance in java through interface.
In interface every methods are abstract by default
In this we don't define the methods.
 */

interface writer
{
    public void write() ;

}
class pen implements writer
{
    public void write()
    {
        System.out.println("I am a pen");
    }
}
class pencil implements writer
{
    public void write()
    {
        System.out.println("I am a pencil");
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
