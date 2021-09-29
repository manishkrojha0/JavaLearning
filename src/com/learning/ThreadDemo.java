package com.learning;
class hi extends Thread
{
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class hello extends Thread
{
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo
{
    public static void main(String[] args) throws InterruptedException {
        hi ob1=new hi();
        hello ob2=new hello();
        ob1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ob2.start();
//        ob1.run();
//        ob2.run();
    }
}
