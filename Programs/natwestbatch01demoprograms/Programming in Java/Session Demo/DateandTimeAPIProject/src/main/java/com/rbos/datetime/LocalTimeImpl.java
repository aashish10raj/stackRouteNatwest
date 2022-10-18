package com.rbos.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalTimeImpl {
    public static void main(String[] args) {
        LocalTime current=LocalTime.now();
        System.out.println(current);
        // Convert String Time into Time Object
        String morning="07-30-30";
        LocalTime morningTime=LocalTime.parse(morning, DateTimeFormatter.ofPattern("[HH-mm-ss]"));
        System.out.println(morningTime);

        // Differnce between time ------> Duration
        Duration duration=Duration.between(morningTime,current);
        System.out.println("Duration = "+duration);
        // LocalDateTime class
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("Date & Time :"+dateTime);

        //ZonedDateTime class
        ZonedDateTime currentZone=ZonedDateTime.now();
        System.out.println("Current Zone : "+currentZone);

        //ZoneId
      //  ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
        //  America/Antigua

        ZoneId zoneId=ZoneId.of("America/Antigua");
        ZonedDateTime america=ZonedDateTime.now(zoneId);
        System.out.println("America/Antigua : "+america);




    }
}
