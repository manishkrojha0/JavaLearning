package com.learning;
class calc
{
    int n1;
    int n2;
    int res;
    public calc()  // constructor is the member method 2. it has the same of class 3. returns nothing  4. it is use to allocates memory. 5.contructor are called automatically.
    {
        n1=4;
        n2=5;
        System.out.println(n1+ " "+ n2);
    }
    public calc(int k) // parameterised constructor
    {
        n1=k;
        System.out.println("k");
    }
    public  void perform()
    {
        res=n1+n2;
        System.out.println(res);
    }
}
public class classesObject {
    public static void main(String[] args) {
        calc obj=new calc();
//        obj.n1=2;
//        obj.n2=4;
        obj.perform();
    }
}
