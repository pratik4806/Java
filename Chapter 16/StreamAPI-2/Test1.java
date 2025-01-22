/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// How to get Stream instance

public class Test1 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        
        // 1st way to get Stream instance
//        Stream<Integer> s1=al.stream();
//        s1.forEach(e->System.out.println(e));
        
        //2nd way to get Stream instance
//        Stream s2=Stream.of(al);
//        s2.forEach(e->System.out.println(e));
        
        //3rd way to get Stream instance
        //Stream s3=Stream.of(100,200,300,400,500);
//        Stream s3=Stream.of("deepak", "rahul", "amit", "deepesh", "kamal");
//        s3.forEach(e->System.out.println(e));
        
        //4th way to get Stream instance
//        int[] arr={600,700,800,900,1000};
//        IntStream s4=Arrays.stream(arr);
//        s4.forEach(e->System.out.println(e));
        
        //5th way to get Stream empty instance
//        Stream s5=Stream.empty();
        
        //6th way to get Stream instance
//        Stream s6=Stream.builder().build();
    }
}
