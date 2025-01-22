/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Deepak
 */
public class Test4 
{
    public static void main(String[] args)
    {
        HashMap<String, String> hm=new HashMap<String, String>();
        
        hm.put("101", "deepak");
        hm.put("102", "amit");
        hm.put("103", "rahul");
        hm.put("104", "deepesh");
        hm.put("105", "priya");
        
        for(Map.Entry me:hm.entrySet())
        {
            System.out.println(me.getKey()+" : "+me.getValue());
        }
    }
}
