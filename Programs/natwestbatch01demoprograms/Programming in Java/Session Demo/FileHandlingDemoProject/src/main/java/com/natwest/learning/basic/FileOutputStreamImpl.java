package com.natwest.learning.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamImpl {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        File file;
        String myContent;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your content : ");
        myContent=scanner.nextLine();

        file=new File("testDirectory/assignment.txt");
        try {
            fos=new FileOutputStream(file);
            if(file.exists()){
                file.createNewFile();
            }
            byte[] bytesArray=myContent.getBytes();
            fos.write(bytesArray);
            fos.flush();
            System.out.println("File written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
