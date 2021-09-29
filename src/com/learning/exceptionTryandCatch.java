package com.learning;

public class exceptionTryandCatch {
    public static void main(String[] args) {

        try {
            int div=10/0;
            System.out.println(div);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        finally {                        /// finally will execute in every situation
            System.out.println("hello");
        }

    }
}
