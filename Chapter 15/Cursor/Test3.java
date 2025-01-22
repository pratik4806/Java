/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursorsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Deepak
 */
public class Test3
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("ddd");
        
        //ArrayList al1=new ArrayList();
        
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            
            String element=(String)itr.next();
            if(element.equals("bbb"))
            {
                itr.remove();
                System.out.println("Element removed successfully");
            }
//            else
//            {
//                al1.add(element);
//            }
        }
        //System.out.println(al1);
    }
}
