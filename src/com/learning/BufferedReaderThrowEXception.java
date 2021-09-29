package com.learning;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderThrowEXception {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter any word");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        var n=br.readLine();
        System.out.println(n);
        br.close();
    }
}
