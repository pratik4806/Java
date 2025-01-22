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

class PlayVideo
{
    void executeVideo()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println("Video is playing");
        }
    }
}
class PlaySound
{
    void executeSound()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println("Sound is executing");
        }
    }
}
public class Vlc1 
{
    public static void main(String[] args)
    {
        PlayVideo pv=new PlayVideo();
        pv.executeVideo();
        
        PlaySound ps=new PlaySound();
        ps.executeSound();
    }
}
