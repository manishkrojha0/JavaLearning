package com.learning;
class hii implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(500);
            }
            catch(Exception e)
            {

            }
        }
    }
}
class namaste implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("namaste");
            try {
                Thread.sleep(500);
            }
            catch(Exception e)
            {

            }
        }
    }
}
public class InterfaceThread {
    public static void main(String[] args) {
        hii ob1=new hii();
        namaste ob2= new namaste();
        Thread t1=new Thread(ob1);
        Thread t2 =new Thread(ob2);
        t1.start();
        try {
            Thread.sleep(10);
        }
        catch (Exception e)
        {

        }
        t2.start();
    }
}
