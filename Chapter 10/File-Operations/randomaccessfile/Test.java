/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomaccessdemo;

import java.io.RandomAccessFile;

/**
 *
 * @author Deepak
 */
public class Test
{
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile raf=new RandomAccessFile("D:\\SDLC\\aabbcc", "r");
        raf.seek();
    }
}
