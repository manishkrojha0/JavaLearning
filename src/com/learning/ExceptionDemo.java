package com.learning;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i,j;
        i=0;
        j=1;
      //  int k=i/j;
        try {
            int k=i/j;
            if(k==0)
                throw new ManishException("this is not possible");
            System.out.println(k);
        }
        catch (ManishException e)
        {
            System.out.println("Error :"+ e.getMessage());
        }
    }
}
