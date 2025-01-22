/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetdemo;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Deepak
 */
public class Test3
{
    public static void main(String[] args)
    {
        //HashSet hs=new HashSet(5, .80f);
        
        HashSet hs=new HashSet();
        
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        hs.add("bbb");
        hs.add("aaa");
        
        System.out.println(hs);
    }
}
