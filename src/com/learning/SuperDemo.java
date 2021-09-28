package com.learning;
class A
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int i)
    {
        System.out.println("in A in const1 "+i);
    }
}
class B extends A
{
    public B()
    {
        super(4);
        System.out.println("in B");
    }
    public B(int i)
    {
        super(i);
        System.out.println("in B in const1 "+i);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        B obj=new B();

    }
}
