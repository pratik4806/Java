/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdemo;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class Test
{
    public static void main(String[] args)
    {
        String[] strarr=new String[3];
        strarr[0]="deepak";
        strarr[1]="amit";
        strarr[2]="rahul";
        
        String name=strarr[1];
        System.out.println(name);
        
        //--------------------------------------------
        
        ArrayList al=new ArrayList();
        
        al.add("deepak");
        al.add(101);
        al.add(10.0f);
        
        String name1=(String)al.get(0);
        int aa=(int)al.get(1);
        System.out.println(name1);
        System.out.println(aa);
        
        //------------------------------------------
        
        ArrayList<Integer> all=new ArrayList<Integer>();
//        all.add("deepak");
//        all.add("rahul");
//        all.add("deepesh");
        
        //String name2=all.get(0);
    }
}
