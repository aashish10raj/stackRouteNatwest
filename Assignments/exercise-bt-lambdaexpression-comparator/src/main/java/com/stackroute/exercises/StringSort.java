package com.stackroute.exercises;


import java.util.Collections;
import java.util.List;

public class StringSort {

    //write here logic to sort a string List
    public String stringSorter(List<String> stringList, String sortingOrder) {

        if (sortingOrder==null ||sortingOrder =="" || stringList==null || stringList.isEmpty()|| sortingOrder == " ")
            return "Given stringList or sortingOrder is empty, null or blank space";
        else {
            if (!sortingOrder.equals("desc") && !sortingOrder.equals("ASC") && !sortingOrder.equals("asc"))
                return "No sorting order present for given string 'demo' , 'asc' for ascending order sort and 'desc' for descending order sort";
            else {
                for (Object obj : stringList) {
                    if (obj == ""|| obj==" ")
                        return "The list contains an empty or blank space value";
                }
                if (stringList.size() == 1)
                    return "The list contains only one value";
                else {
                    if (sortingOrder == "desc") {
                        Collections.sort(stringList, (a, b) -> (int) b.compareTo(a));
                        return stringList.toString();
                    }
                    if (sortingOrder == "ASC") {
                        Collections.sort(stringList, (a, b) -> (int) a.compareTo(b));
                        return stringList.toString();
                    }
                }
            }
        }
        return null;
    }
}
