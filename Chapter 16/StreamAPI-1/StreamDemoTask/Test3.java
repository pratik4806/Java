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

// WAP to print all the names whose name starts with d

public class Test3 
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
        s.filter(e->e.startsWith("x")).forEach(e->System.out.println(e));
    }
}
