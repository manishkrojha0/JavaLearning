package com.learning;
class Animal
{
    public void  eat()
    {
        System.out.println("Animal eat");
    }
}
class Dog extends Animal
{
    public void eat()
    {
        System.out.println("Dog eat");
    }
}
class Cat extends Animal
{
    public void eat()
    {
        System.out.println("cat eat");
    }
}
public class DynamicOverRiding {
    public static void main(String[] args) {
        Animal ob=new Animal();
        ob.eat();
        ob=new Dog(); /// runtime polymorphism
        ob.eat();    // dynamic method dispatch
        ob=new Cat();
        ob.eat();
    }
}
