package com.natwest.learning.basic;

import java.io.*;

public class MyDataImpl {
    public static void main(String[] args) {
        int cityIDA=1;
        String cityNameA="Bangalore";
        int cityPopulationA=5000000;
        float cityTempA=20.0f;

        // Wrriting primitive data
        FileOutputStream fos;

        try {
            fos=new FileOutputStream("testDirectory/cities.dat");
            DataOutputStream dos=new DataOutputStream(fos);
            dos.writeInt(cityIDA);
            dos.writeUTF(cityNameA);
            dos.writeInt(cityPopulationA);
            dos.writeFloat(cityTempA);
            dos.flush();
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading primitive data
        try {
            FileInputStream fis=new FileInputStream("testDirectory/cities.dat");
            DataInputStream dis=new DataInputStream(fis);

            int cityId=dis.readInt();
            System.out.println("City ID : "+cityId);
            String cityName=dis.readUTF();
            System.out.println("City Name : "+cityName);
            int cityPopulation=dis.readInt();
            System.out.println("City Population : "+cityPopulation);
            float cityTemp=dis.readFloat();
            System.out.println("City Temprature : "+cityTemp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
