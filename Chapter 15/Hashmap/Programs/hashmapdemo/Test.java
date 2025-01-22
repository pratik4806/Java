/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapdemo;

import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Deepak
 */
public class Test
{
    public static void main(String[] args)
    {
        HashMap hm=new HashMap();
        
        hm.put(101, "deepak");
        hm.put(105, "kamal");
        hm.put(104, "deepesh");
        hm.put(102, "rahul");
        hm.put(106, "amit");
        hm.put(116, "aaa");
        
        System.out.println(hm);
    }
}
