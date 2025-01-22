/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingdemo1;

/**
 *
 * @author Deepak
 */
class PlayVideo2 extends Thread
{
    public void run()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println("Video is playing");
        }
    }
}
class PlaySound2 extends Thread
{
    public void run()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println("Sound is executing");
        }
    }
}
public class Vlc2
{
    public static void main(String[] args)
    {
        PlayVideo2 pv=new PlayVideo2();
        pv.start();
        
        PlaySound2 ps=new PlaySound2();
        ps.start();
    }
}