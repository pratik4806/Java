/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo3;

/**
 *
 * @author Deepak
 */
public class StringDemo3
{
    public static void main(String[] args)
    {
        String name="deepak";
        name.concat("java");
        System.out.println(name);
        
        
        StringBuffer sb=new StringBuffer("deepak");
        sb.append("java");
        System.out.println(sb);
        
        StringBuilder sbb=new StringBuilder("deepak");
        
        
        //System.out.println(sb.insert(3, "abc"));
    }
}
