/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class ArrayAndArrayList
{
    public static void main(String[] args)
    {
        int[] arr=new int[3];
        
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        
        System.out.println(arr);    //[I@xxxxxx
//        for(int i:arr)
//        {
//            System.out.println(i);
//        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        //------------------------------------------
        ArrayList al=new ArrayList();
        
        al.add(100);
        al.add(200);
        al.add(300);
        
        System.out.println(al);
//        for(Object obj:al)
//        {
//            System.out.println(obj);
//        }
        for(int i=0; i<al.size(); i++)
        {
            System.out.println(al.get(i));
        }
    }
}
