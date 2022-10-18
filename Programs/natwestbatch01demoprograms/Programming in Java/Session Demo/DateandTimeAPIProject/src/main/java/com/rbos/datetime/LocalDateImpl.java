package com.rbos.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateImpl {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println("Today : "+today);
        System.out.println("Year : "+today.getYear());
        System.out.println("Month : "+today.getMonth());
        System.out.println("Day of Year : "+today.getDayOfYear());
        System.out.println("Day of Week : "+today.getDayOfWeek());

        // create userdefined date
        LocalDate wednesday=LocalDate.of(2022,8,17);
        System.out.println("Wednesday : "+wednesday);

        // convert String to Date object

        String tomorrow="2022/08/17";
        DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate tomorrowDate=LocalDate.parse(tomorrow,format);
        System.out.println(" Tomorrow : "+tomorrowDate);

        // comparing dates

        System.out.println("Before : "+today.isBefore(tomorrowDate)); // true
        System.out.println("After : "+today.isAfter(tomorrowDate)); // false
        System.out.println("Compare To : "+tomorrowDate.compareTo(today));

        // Date Manipulation
        LocalDate d5m2y4=today.plusDays(5).plusMonths(2).plusYears(4);
        System.out.println(d5m2y4);
//        LocalDate d5m2y4=today.minusDays(5).minusMonths(2).minusYears(4);
//        System.out.println(d5m2y4);

        // Difference between two dates ===> period
        // Difference between time ==> duration

        Period period= Period.between(today,d5m2y4);
        System.out.println(period);






























    }
}
