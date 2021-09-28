package com.learning;
class student
{
   private  int rollno;
    private String name;
    // getters and setters
    public void setRollno(int r)
    {
        rollno=r;
    }
    public void setName(String s)
    {
        name=s;
    }
    public int getRollno()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        student obj=new student();
        obj.setRollno(4);
        System.out.println(obj.getRollno());
        obj.setName("manish");
        obj.getName();
        System.out.println(obj.getName());
    }
}
