/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonew;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

/**
 *
 * @author Deepak
 */
public class Test4 
{
    public static void main(String[] args)
    {
//        ZoneId zi=ZoneId.of("America/New_York");
//        
//        LocalDate ld=LocalDate.now(zi);
//        System.out.println(ld);
//        
//        LocalTime lt=LocalTime.now(zi);
//        System.out.println(lt);
        
        //---------------------------------------------------------
//        LocalTime indian_time=LocalTime.now();
//        
//        ZoneId zi=ZoneId.of("America/New_York");
//        LocalTime america_time=LocalTime.now(zi);
//        
//        long l=ChronoUnit.HOURS.between(america_time, indian_time);
//        System.out.println(l);
        
        //------------------------------------------------------------
//        String[] arr=TimeZone.getAvailableIDs();
//        for(String a:arr)
//        {
//            System.out.println(a);
//        }
        
        //-----------------------------------------------------------
        Clock c=Clock.systemDefaultZone();
        System.out.println(c);
    }
}
