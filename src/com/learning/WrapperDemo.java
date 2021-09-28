package com.learning;

public class WrapperDemo {
    public static void main(String[] args) {
        int i=5;
        Integer ii=new Integer(i); // wrapper class
        int j= ii; //unboxing
        System.out.println(j);
        Integer value=j ;// auto boxing
        int k=value; // auto unboxing
    }
}
