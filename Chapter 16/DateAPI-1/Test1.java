/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonew;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Deepak
 */
public class Test1 
{
    public static void main(String[] args)
    {
       LocalDate ld1=LocalDate.now();  //yyyy-MM-dd
       System.out.println(ld1);
        
        
        // ----------------------------------------------------------
       LocalDate ld1=LocalDate.now();
       DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
       String current_date=ld1.format(dtf);
       System.out.println(current_date);
        
       String current_date=dtf.format(ld1);
       System.out.println(current_date);
        
        
        // -----------------------------------------------------------
       String selected_date="01-Jan-1990";
       DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
       LocalDate ld=LocalDate.parse(selected_date, dtf);   //yyyy-MM-dd
       System.out.println(ld);
        
        // ------------------------------------------------------------
       LocalDate ld2=LocalDate.now();
       System.out.println(ld2.getDayOfMonth());
       System.out.println(ld2.isLeapYear());
        
       LocalDate ldnew=ld.minusDays(9);
       System.out.println(ldnew);
        
       LocalDate ldnew=ld.plusMonths(7);
       System.out.println(ldnew);
        
        
        // -------------------------------------------------------------
       LocalDate ld3=LocalDate.of(2021, 01, 01);
       System.out.println(ld3.isLeapYear());
    }
}
