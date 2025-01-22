/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamapidemo;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author Deepak
 */
public class Test5 
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add("deepak");
        al.add("rahul");
        al.add("amit");
        al.add("deepesh");
        al.add("ankit");
        
        Stream<String> s=al.stream();
        //s.forEach(e->System.out.println(e));
        //s.sorted().forEach(e->System.out.println(e));
        
        s.sorted((x,y)->-x.compareTo(y)).forEach(e->System.out.println(e));
    }
}
