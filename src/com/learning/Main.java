package com.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello World");
        System.out.println("manish my name is");
        //primitive data types
        byte age=40;
        long phone =1929393933;
        float pi=3.14F;
        char c='m';
        //non- primitive data types
        // string
        String str="manish";
        String str2="kumar";
        String str3="ojha";
        System.out.println(str+" "+str2+" "+str3);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        // replace
        String name =str.replace('a','v');
        System.out.println(name);
        //// in java strings are immutable
        /// substrings
        System.out.println(name.substring(0,6));
    }
}
