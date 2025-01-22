/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonew;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Deepak
 */
public class Test2
{
    public static void main(String[] args)
    {
//        LocalTime lt=LocalTime.now();
//        System.out.println(lt);
        
        //-----------------------------------------------------
//        LocalTime lt=LocalTime.now();
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
//        String current_time=lt.format(dtf);
//        System.out.println(current_time);
        
//        String current_time=dtf.format(lt);
//        System.out.println(current_time);
        
        //--------------------------------------------------------
        LocalTime lt=LocalTime.now();
        System.out.println(lt.getHour());
        System.out.println(lt.minusHours(40));
    }
}
