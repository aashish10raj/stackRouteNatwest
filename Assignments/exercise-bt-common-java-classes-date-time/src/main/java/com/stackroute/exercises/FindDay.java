package com.stackroute.exercises;

import java.time.LocalDate;
public class FindDay {

    //write logic to find day of the date and return result
    public String findDay(int month, int day, int year) {
        if((month<1 || month>12 )&& (day<1 || day>31 )&& (year<2000 || year>3000))
            return "Give month in rangeGive day in rangeGive year in range";
        if((month<1 || month>12) && (day<1 || day>31))
            return "Give month in rangeGive day in range";
        if ((day<1 || day>31) && (year<2000 || year>3000))
            return "Give day in rangeGive year in range";
        if ((month<1 || month>12)&& (year<2000 || year>3000))
            return "Give month in rangeGive year in range";
        if(month<1 || month>12)
            return "Give month in range";
        if(day<1 || day>31)
            return "Give day in range";
        if (year<2000 || year>3000)
            return "Give year in range";
        else
        {
            LocalDate date=LocalDate.of(year,month,day);
            return date.getDayOfWeek().toString();
        }


    }
}
