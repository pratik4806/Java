/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtabledemo;

import java.util.Hashtable;

/**
 *
 * @author Deepak
 */
public class Test 
{
    public static void main(String[] args)
    {
        Hashtable ht=new Hashtable(15);
        
        ht.put(101, "deepak");
        ht.put(105, "kamal");
        ht.put(104, "deepesh");
        ht.put(102, "rahul");
        ht.put(106, "amit");
        ht.put(116, "aaa");
        
        System.out.println(ht);
    }
}
