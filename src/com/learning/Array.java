package com.learning;

import java.util.Arrays;
class ArrayofClasses
{
   static  int roll;
    static String name;

}
public class Array {
    public static void main(String[] args) {
        int [] marks=new int[3]; // array declaration primitive
        marks[0]=100;
        marks[1]=98;
        marks[2]=90;
        Arrays.sort(marks);
        System.out.println(marks.length);
        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]);
        }
        /// 2d arrays
        int [][] finalMarks={{10,20,30},{30,49,40}};
        for (int[] finalMark : finalMarks) {
            for (int j = 0; j < finalMarks[0].length; j++) {
                System.out.print(finalMark[j] + " ");
            }
            System.out.println();
        }
        ArrayofClasses obj[]=new ArrayofClasses[4];
        for(ArrayofClasses ob:obj)
        {
            ArrayofClasses.roll=4;
            ArrayofClasses.name="manish";
            System.out.println(ArrayofClasses.roll);
            System.out.println(ArrayofClasses.name);
        }
    }
}
