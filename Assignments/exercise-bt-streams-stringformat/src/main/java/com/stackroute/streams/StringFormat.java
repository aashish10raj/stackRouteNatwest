package com.stackroute.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringFormat {

    //write logic to find the format for given list and return result
    public String findStringFormat(List<Integer> input) {

        if(input.isEmpty()){
            return "Give proper input not empty list";
        }
        for(Integer num:input){
            if(num<0){
                return "Give proper input not negative values";
            }

        }
        List<String> resultSet=new ArrayList<>();
        String finalResult;
        resultSet=input.stream().map(x->x%2==0?"even"+x:"odd"+x).collect(Collectors.toList());
        finalResult= resultSet.stream().map(Objects::toString).collect(Collectors.joining(","));
        return finalResult;


    }
}
