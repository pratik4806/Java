/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identityhashmapdemo;

import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 *
 * @author Deepak
 */
public class Test2
{
    public static void main(String[] args)
    {
        Integer i1=new Integer(100);
        Integer i2=new Integer(100);
        
        HashMap hm=new HashMap();
        hm.put(i1, "deepak");
        hm.put(i2, "rahul");        // i1.equals(i2) - true
        System.out.println(hm);
        
        IdentityHashMap ihm=new IdentityHashMap();
        ihm.put(i1, "deepak");
        ihm.put(i2, "rahul");       // i1==i2 - false
        System.out.println(ihm);
    }
}
