/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weakhashmapdemo;

/**
 *
 * @author Deepak
 */
class A
{
    A()
    {
        System.out.println("object created");
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("object deleted");
    }
}
public class Test1
{
    public static void main(String[] args)
    {
        A ob=new A();
        
        ob=null;
        System.gc();
    }
}
