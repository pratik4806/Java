/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamsdemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Deepak
 */
public class BufferedOutputStreamDemo {

    public static void main(String[] args) throws Exception {
        String str = "this is buffered demo program..!!";

        FileOutputStream fos = new FileOutputStream("D:\\student1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(str.getBytes());

        bos.flush();
        bos.close();

        fos.close();
    }
}
