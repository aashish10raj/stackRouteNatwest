package com.natwest.learning.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterImpl {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("testDirectory/mentors.txt");
        FileWriter fw=new FileWriter("testDirectory/feedback.txt");

        int c;
        while((c= fr.read())!=-1){
            fw.write(c);
        }
        fr.close();
        fw.close();
        System.out.println("Success---------------------------------");
    }
}
