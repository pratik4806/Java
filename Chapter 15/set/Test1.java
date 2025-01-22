/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetdemo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Deepak
 */
public class Test1
{
    public static void main(String[] args)
    {
        Set hs=new HashSet();
        
        hs.add("fff");
        hs.add(10);
        hs.add("ccc");
        hs.add("ddd");
        hs.add("sss");
        hs.add("ggg");
        
        System.out.println(hs);
    }
}
