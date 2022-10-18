package com.stackroute.fileio;

import javax.imageio.stream.ImageInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;



public class RemoveDuplicateLines {
    //write logic to read data from input.txt and  write result to output.txt
    public static void main(String[] args) throws IOException {
        removeDuplicateLines();
    }
    public static void removeDuplicateLines() throws IOException {
        PrintWriter pw = new PrintWriter("output.txt");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        String line = br.readLine();
        HashSet<String> hs = new HashSet<String>();
        while(line != null)
        {

            if(hs.add(line))
                pw.println(line);

            line = br.readLine();

        }

        pw.flush();

        // closing resources
        br.close();
        pw.close();



    }
}
