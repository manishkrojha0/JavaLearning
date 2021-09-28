package com.learning;

class base
{
    public void show()
    {
        System.out.println("base class function");
    }
}
class derive extends  base
{
    public void show()
    {
        super.show();
        System.out.println("derive class function");
    }
}
public class OverRidingDemo {
    public static void main(String[] args) {
         derive obj=new derive();
         obj.show();
    }
}
