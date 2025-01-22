/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Deepak
 */
public class Test implements Cloneable
{
    int i;
    String str;
    Test(){}
    
    Test(int i, String str)
    {
        this.i=i;
        this.str=str;
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Test t1=new Test(10, "deepak");
        
        Test t2=(Test)t1.clone();
        
        System.out.println(t2.i);
        System.out.println(t2.str);
    }
}
