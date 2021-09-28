package com.learning;
class calc1
{
    int n1;
    int n2;
    int res;
    public calc1(int n1,int n2)
    {
        this.n1=n1; // this is the current object of class
        this.n2=n2;
    }
    public void show()
    {
        System.out.println(n1+" "+n2);
    }

}
public class ThisKeyword {
    public static void main(String[] args) {
         calc1 obj=new calc1(4,8);
         obj.show();
    }
}
