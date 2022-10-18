package com.natwest.learning.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dateString=sdf.format(date);
        System.out.println("Date in format of : "+dateString);

    }
}
