package com.learning;
class add
{
    public int addition(int ... n)  /// with prefix of three dots we can make it work like taking multiple values.
    {
        int s=0;
        for(int i:n)
        {
            s+=i;
        }
        return s;
    }
}
public class VarargsDemo {
    public static void main(String[] args) {
        add obj=new add();
        System.out.println(obj.addition(3,4,5,6,7));
    }
}
