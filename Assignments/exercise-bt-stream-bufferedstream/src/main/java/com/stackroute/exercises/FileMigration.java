package com.stackroute.exercises;


import java.io.*;
import java.util.Scanner;

public class FileMigration {

//    public static void main(String[] args) throws IOException {
//
//        String string = fileContentDuplicator("test.txt", "secondFile.txt");
////        System.out.println(string);
////        System.out.println("Successfully Copied");
//    }
    public static String fileContentDuplicator(String fileOne, String fileTwo) throws IOException {
        String output;

        if (fileOne == null || fileOne == "" || fileOne == " " || fileTwo == null || fileTwo == "" || fileTwo == " ") {
            return "Given fileName to read or write is empty, null or blank space";
        } else if(!fileOne.contains(".txt") || !fileTwo.contains(".txt")){
            throw new IOException("Invalid File Format");
        } else {
            FileInputStream source = new FileInputStream(fileOne);
            FileOutputStream target = new FileOutputStream(fileTwo);

            BufferedInputStream bfin = new BufferedInputStream(source);
            BufferedOutputStream bfout = new BufferedOutputStream(target);

            StringBuffer sb = new StringBuffer();
            BufferedReader breader = new BufferedReader(new InputStreamReader(source));
            String line = breader.readLine();

            while ( line != null) {
                byte[] var = line.getBytes();
                sb.append(line);
                bfout.write(var);
                line = breader.readLine();
            }
            bfin.close();
            bfout.close();
            output = sb.toString();
        }
        return output;
    }


}
