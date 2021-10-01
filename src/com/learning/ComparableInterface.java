package com.learning;

import java.util.*;
class stud implements Comparable<stud>
{
    int roll;
    String name;
    public stud(int roll,String name)
    {
        super();
        this.roll=roll;
        this.name=name;
    }

    @Override

    public int compareTo(stud o) {
        return roll<o.roll?-1:1;
    }
}
public class ComparableInterface {
    public static void main(String[] args) {
        List<stud> values= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val= sc.nextInt();
            String name=sc.next();
            stud ob=new stud(val,name);
            values.add(ob);
        }
        for(stud s:values)
        {
            System.out.println(s.roll+" "+s.name);
        }
    }
}
