/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Deepak
 */
public class Test5
{
    public static void main(String[] args)
    {
        HashMap hm=new HashMap();
        Map map=Collections.synchronizedMap(hm);
        
        HashMap hm2=new HashMap(map);
        
    }
}
