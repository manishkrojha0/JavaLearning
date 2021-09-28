package com.learning;
class calculator
{
    int i,j;
    public calculator(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}
class addCalc
{

    public int add(int i,int j)
    {
        return i+j;
    }
}
class subCalc extends addCalc
{


    public int sub(int i,int j)
    {
        return i-j;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        subCalc obj=new subCalc();
        int r1=obj.sub(5,3);
        int r2=obj.add(4,6);
        System.out.println(r1);
        System.out.println(r2);
    }
}
