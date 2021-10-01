package com.learning;

import java.security.Key;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map =new HashMap<>();
        map.put("name","manish");
        map.put("clg","GLBITM");
        map.put("Company","Kuliza");
        map.put("empid","IN116");
        Set<String> keys= new TreeSet<>();
        for(String key:map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
        for(String values:map.values())
        {
            System.out.println(values);
        }
        for(Map.Entry<String,String> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        map.forEach((key,value)->
                System.out.println(key+"="+value));
        SortedMap<String,String> om= new TreeMap<>();
        om.put("abc","45");
        om.put("abcd","56");
        om.put("a","3");
        om.put("abbc","43");
        om.forEach((key,value)->
                System.out.println(key+" "+value));
    }
}
