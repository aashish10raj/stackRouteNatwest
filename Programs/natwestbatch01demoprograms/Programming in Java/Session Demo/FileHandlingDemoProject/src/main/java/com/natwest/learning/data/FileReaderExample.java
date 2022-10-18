package com.natwest.learning.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FileReaderExample {
    static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    static int fileLineCoutnt(String fileName) throws FileNotFoundException {
        int count=0;
        try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
            while(br.readLine()!=null){
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    static Person[] readFromFile(String fileName) throws FileNotFoundException {
        int numberOfPersons=fileLineCoutnt(fileName);
        Person[] persons=new Person[numberOfPersons-1];

        try(BufferedReader br1=new BufferedReader(new FileReader(fileName))){
            br1.readLine();
            int index=0;
            String line=null;
            while((line= br1.readLine())!=null){
                String[] arr=line.split(",");
                Person p=new Person();
                p.setName(arr[0]);
                p.setAge(Integer.parseInt(arr[1]));
                p.setAddress(arr[2]);
                p.setDate(sdf.parse(arr[3]));
                persons[index]=p;
                index++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Person[] p=readFromFile("testDirectory/Sample.csv");
        System.out.println(p.length);
        for(int i=0; i<p.length; i++){
            System.out.println(p[i].getName()+ " :: "+p[i].getAge()+ " :: "+p[i].getAddress()+ " :: "+p[i].getDate());
        }

    }

}
