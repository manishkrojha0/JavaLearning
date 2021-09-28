package com.learning;
class emp
{
    int eid;
    int salary;
    static String ceo;
    static
    {
        ceo="ansu jain";
    }
    public void show()
    {
        System.out.println(eid);
        System.out.println(salary);
        System.out.println(ceo);
    }
}
public class Static {
    public static void main(String[] args) {
        emp manish =new emp();
        manish.eid=116;
        manish.salary=1000000;
        emp raj =new emp();
        raj.eid=115;
        raj.salary=10000000;
      //  emp.ceo="deepthi";
        manish.show();
        raj.show();
    }
}
