package com.natwest.learning.basic;

import java.io.*;

public class FileInputStreamImpl {
    public static void main(String[] args) throws IOException {
        File file=new File("testDirectory/mentors.txt");
        FileInputStream fis=null;
        BufferedInputStream bis=null;

        try {
            fis=new FileInputStream(file);
            bis=new BufferedInputStream(fis);

            while (bis.available()>0){
                System.out.print((char)bis.read());
            }

        }  catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(bis !=null && fis !=null){
                bis.close();
                fis.close();
            }
        }
    }
}
