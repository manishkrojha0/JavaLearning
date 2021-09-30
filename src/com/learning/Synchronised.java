package com.learning;

import org.w3c.dom.ls.LSOutput;

class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}
public class Synchronised {
    public static void main(String[] args) throws InterruptedException {
        Counter c= new Counter();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++)
                {
                    c.increment();
                }
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++)
                {
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count:"+c.count);
    }
}
