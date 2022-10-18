package com.natwest.learning.basic;

import java.io.File;
import java.io.IOException;

public class FileImpl {
    public static void main(String[] args) {
        System.out.println("File Class Implementation ");
        File directory=new File("testDirectory");
        directory.mkdir(); // create a directory
        File file=new File(directory,"learners.txt"); // create a file
        File file2=new File(directory,"mentors.txt"); // create a file

        try {
            file.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
