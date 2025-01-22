/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamapidemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Deepak
 */

//WAP to get all the even numbers in an arraylist
//WAP to count all the even numbers in an ArrayList

public class Test2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(55);
        
        //-----------------using collections and simple logic--------------------
//        for(int i:al)
//        {
//            if(i%2==0)
//            {
//                System.out.println(i);
//            }
//        }
        
        //------------------using stream api (first part)-------------------------------
//        Stream<Integer> s=al.stream();
//        List l=s.filter(e->e%2==0).collect(Collectors.toList());
//        System.out.println(l);
        
        
        //------------------using stream api (second part)-------------------------------
//        Stream<Integer> s=al.stream();
//        s.filter(e->e%2==0).forEach(e->System.out.println(e));
        
        
        //------------------using stream api (second part)-------------------------------
        //al.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
        
        
        //--------------count even numbers----------------------------
        System.out.println(al.stream().filter(e->e%2==0).count());

        
        
        
        //method chaining
//        String name="deepak";
//        String s1=name.concat("java");
//        String s2=s1.toUpperCase();
//        int l=s2.length();
//        
//        int leng=name.concat("java").toUpperCase().length();
//        System.out.println(leng);
    }
}
