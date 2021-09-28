package com.learning;

public class ConditionalStatement {
    public static void main(String[] args) {
        int i=4;
        int j=1;
        if(i>6)
            j=2;
        else
            j=1;
        j=i>2?2:4;  // ternary operator
        System.out.println(i +" "+ j);
        //Switch operator
        int n=9;
        switch (n)
        {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("not found!");
        }


    }
}
