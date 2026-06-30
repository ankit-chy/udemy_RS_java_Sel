package com.sec38.collections;
import java.util.ArrayList;

public class Exercise {


    public static void main (String[] args) {

        ArrayList<String> as  = new ArrayList<String>();
        
        as.add("apple");
        as.add("banana");
        as.add("banana");
        as.add("mango");
        as.add("apple");
        
        System.out.println(as);
       
        as.remove(0);
        System.out.println(as);
        
        System.out.println("Orange is found : " + as.contains("orange"));
        
        System.out.println(as.size());
        
        for(int i = 0; i<as.size();i++){
            System.out.println(i);
            System.out.println(as.get(i));   
            }
       
    }

}