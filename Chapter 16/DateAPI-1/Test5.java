/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonew;

import java.time.Year;
import java.time.YearMonth;

/**
 *
 * @author Deepak
 */
public class Test5
{
    public static void main(String[] args)
    {
        Year y=Year.now();
        System.out.println(y);
        System.out.println(y.atDay(100));
        System.out.println(y.length());
        
        //-----------------------------------------------
        YearMonth ym=YearMonth.now();
        System.out.println(ym);
    }
}
