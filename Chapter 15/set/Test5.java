/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author Deepak
 */
public class Test5 
{
    public static void main(String[] args)
    {
        //HashSet hs=new HashSet();
        LinkedHashSet hs=new LinkedHashSet();
        
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        hs.add("eee");
        hs.add("fff");
        
        System.out.println(hs);
    }
}
