/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treemapdemo;

import java.util.TreeMap;

/**
 *
 * @author Deepak
 */
public class Test1
{
    public static void main(String[] args)
    {
        TreeMap tm=new TreeMap();
        
        tm.put(106, "priya");
        tm.put(101, "deepak");
        tm.put(103, "amit");
        tm.put(102, "rahul");
        tm.put(105, "kamal");
        tm.put(104, "deepesh");
        //tm.put("abc", "deepika");
        //tm.put(null, "deepika");
        tm.put(102, "rrr");
        
        System.out.println(tm);
    }
}
