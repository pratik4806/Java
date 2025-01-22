/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdemo;

/**
 *
 * @author Deepak
 */
class A<T>
{
    T a;
    A(T a)
    {
        this.a=a;
    }
    void show()
    {
        System.out.println(a);
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        A<String> ob1=new A<String>("deepak");
        ob1.show();
        
        A<Integer> ob2=new A<Integer>(101);
        ob2.show();
    }
}
