package com.natwest.learning.basic;

import java.io.*;

public class SerializationImpl {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name and age");
        Registration r1=new Registration();
        r1.name= br.readLine();
        r1.age= Integer.parseInt(br.readLine());
        // serialization
        ObjectOutputStream objo=new ObjectOutputStream(new FileOutputStream("testDirectory/object.txt"));
        objo.writeObject(r1);
        //deserialization
        Registration r2=new Registration();
        ObjectInputStream obji=new ObjectInputStream(new FileInputStream("testDirectory/object.txt"));
        r2= (Registration) obji.readObject();
        System.out.println(r2);

    }
}
class Registration implements Serializable{
    String name;
   transient int age;

    @Override
    public String toString() {
        return "name= " + name +" : "+" age= " + age ;
    }
}
