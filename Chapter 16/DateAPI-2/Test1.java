/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoold;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Deepak
 */
public class Test1
{
    public static void main(String[] args)
    {
//        Date d=new Date();
//        System.out.println(d);
        
        Date d=new Date();
        
        SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yy");
        String current_date=sdf1.format(d);
        System.out.println(current_date);
        
        SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm:ss");
        String current_time=sdf2.format(d);
        System.out.println(current_time);
    }
}
