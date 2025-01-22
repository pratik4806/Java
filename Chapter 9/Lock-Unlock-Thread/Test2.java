/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsync;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Deepak
 */
public class Test2 
{
    public static void main(String[] args)
    {
        ReentrantLock re=new ReentrantLock();
        re.lock();
        re.lock();
        re.lock();
        
        if(re.tryLock())
        {
            
        }
        
        System.out.println(re.getHoldCount());
        
        System.out.println(re.isLocked());
        
        
        re.unlock();
        re.unlock();
        re.unlock();
        
        System.out.println(re.isLocked());
    }
}
