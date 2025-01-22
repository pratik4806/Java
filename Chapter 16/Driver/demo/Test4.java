/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

// 1. marker interface - 0 abstract method

import java.awt.event.ActionListener;
import java.util.concurrent.Callable;

// 2. functional interface - only 1 abstract method
// 3. normal interface - more than 1 abstract methods

@FunctionalInterface
interface I4
{
    void m1();
}

@FunctionalInterface
interface II4 extends I4
{
    
}

public class Test4 
{
    
}
