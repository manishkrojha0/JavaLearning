package com.learning;

public class LamdaThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(()->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("hi");
                try {
                    Thread.sleep(500);
                }
                catch(Exception ignored){};
            }
        });
        Thread t2 =new Thread(()->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("hello");
                try {
                    Thread.sleep(500);
                }
                catch(Exception ignored){};
            }
        });
        t1.start();
        try {
            Thread.sleep(50);
        }
        catch (Exception e)
        {

        }
        t2.start();
        /*
          here we will join concept of threads we join the both threads to the main threads .
          if the task of two threads t1,t2 gets over we perform the main task.
         */
        t1.join();
        t2.join();
        /*
        IsaLive is the method to check whether the threads are in the running states or not.
         */
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println("bye");
    }
}
