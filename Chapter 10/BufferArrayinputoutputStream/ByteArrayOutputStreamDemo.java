/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamsdemo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Deepak
 */
public class ByteArrayOutputStreamDemo {

    public static void main(String[] args) throws Exception {
        String str = "this is Byte Array OutputStream demo...!!";
        FileOutputStream fos1 = new FileOutputStream("D:\\abc.txt");
        FileOutputStream fos2 = new FileOutputStream("D:\\\\abc.txt");

        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        ba.write(str.getBytes());

        ba.writeTo(fos1);
        ba.writeTo(fos2);
    }
}
