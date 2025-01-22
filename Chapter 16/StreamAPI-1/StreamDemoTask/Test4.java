/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author Deepak
 */

// WAP to get the first character of each name
//WAP to replace the 'a' charcter with 'z' character

public class Test4 
{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("deepak");
        al.add("amit");
        al.add("rahul");
        al.add("deepesh");
        al.add("kamal");
        
        Stream<String> s=al.stream();
        //s.map(e->e.charAt(0)).forEach(e->System.out.println(e));
        
//        String name="deepak";
//        System.out.println(name.replace("a", "z"));
        s.map(e->e.replace("a", "z")).forEach(e->System.out.println(e));
    }
}
