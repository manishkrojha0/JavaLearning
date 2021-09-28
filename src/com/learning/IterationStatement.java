package com.learning;

public class IterationStatement {
    public static void main(String[] args) {
        for(int i=0;i<4;i++)  //for loop
        {
            System.out.println("hello manish");
        }
        int i=0;
        while(i<=4)
        {
            System.out.println("hello it's while loop");
            i++;
        }
        /// nested loop
        int n=11,j=0;
        int mid=n/2;
        for(i=0;i<mid;i++)
        {
            for(j=0;j<mid-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=j;k<=mid;k++)
            {
                System.out.print("*");
            }
            for(int l=j;l<mid;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
