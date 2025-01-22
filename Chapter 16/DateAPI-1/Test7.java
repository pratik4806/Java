/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonew;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Deepak
 */
public class Test7
{
    public static void main(String[] args)
    {
//        Duration d=Duration.ofHours(1);
//        System.out.println(d.getSeconds());
        
        
        Duration d=Duration.of(1, ChronoUnit.MINUTES);
        System.out.println(d.getSeconds());
    }
}
