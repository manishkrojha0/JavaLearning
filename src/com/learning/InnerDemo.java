package com.learning;
/*
 inner class - we need to find call the inner class variables or methods using outer class obj.
 member class
 static class- in this we do not need the object of outer the class to call the members of the class outer

 */
class outer
{
    int ob;
    public void show()
    {
        System.out.println("outer class show function");
    }
    class inner
    {
        int ob1;
        public void show()
        {
            System.out.println("show inner");
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {
         outer obj1=new outer();
         obj1.show();
         outer.inner obj2=obj1.new inner();
         obj2.show();
    }
}
