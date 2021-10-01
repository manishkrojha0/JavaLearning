package com.learning;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> values =new ArrayList<Integer>();
        values.add(5);
        values.add(4);
        values.add(4);
        values.add(2,0);
        System.out.println("value at indecx:"+values.get(1));
        Collections.reverse(values);
        System.out.println(values);
        Collections.sort(values);
        Collections.binarySearch(values,4);
        Comparator<Integer> c= (i, j) -> (i<j)?1:-1;

        Collections.sort(values,c);

        for(int a:values)
        {
            System.out.println(a);
        }
        HashMap<Integer,Integer> map=new HashMap<>();

    }
}
