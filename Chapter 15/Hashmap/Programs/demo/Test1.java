/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

class A
{
    int i;
    A(int i)
    {
        this.i=i;
    }
    @Override
    public int hashCode()
    {
        return i;
    }
    @Override
    public String toString() 
    {
        return i+"";
    }
}
public class Test1
{
    public static void main(String[] args)
    {
        A ob1=new A(1);
        System.out.println(ob1.hashCode());
        
        A ob2=new A(2);
        System.out.println(ob2.hashCode());
    }
}
