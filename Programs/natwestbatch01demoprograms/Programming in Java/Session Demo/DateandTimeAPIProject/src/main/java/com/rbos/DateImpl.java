package com.rbos;

import java.util.Date;

public class DateImpl {
    public static void main(String[] args) {
        Date d1=new Date(); // current date
        System.out.println(d1);
        Date d2=new Date(2010,12,21);
        Date d3=new Date(2021,01,11);

        System.out.println(d3.after(d2));
        System.out.println(d1.before(d3));
    }
}
