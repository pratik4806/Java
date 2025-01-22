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

/*
interface I1
{
    void m1();
}
class A implements I1
{
    public void m1()
    {
        System.out.println("i am in m1() method");
    }
}

public class Test1 
{
    public static void main(String[] args)
    {
        A ob=new A();
        ob.m1();
    }
}
*/

interface I1
{
    void m1();
    //void m2();
}
public class Test1
{
    public static void main(String[] args)
    {
        I1 ob=new I1(){
            public void m1()
            {
                System.out.println("i am in m1() method...!!");
            }
//            public void m2()
//            {
//                
//            }
        };
        ob.m1();
    }
}