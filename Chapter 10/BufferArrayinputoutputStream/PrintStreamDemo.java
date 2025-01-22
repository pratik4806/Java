/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamsdemo;

import java.io.PrintStream;

/**
 *
 * @author Deepak
 */
public class PrintStreamDemo
{
    public static void main(String[] args) throws Exception
    {
        PrintStream ps=new PrintStream("D:\\ddd.txt");
        ps.println("hello deepak");
        ps.print(100);
        ps.println("demo");
        ps.close();
        
        System.out.print("hello");
    }
}
