package com.stackroute.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * This class contains methods for adding Fruits to a List and searching the fruits from the List
 */
public class FruitsListService {


    public static List<String> addFruitsToList(String fruitNames) {
//        LinkedHashSet<String> fruits = new LinkedHashSet<String>();
        ArrayList<String> fruits= new ArrayList<>();
        ArrayList<String> tempFruits=new ArrayList<>();

        if(!(fruitNames==null)&& !(fruitNames=="")){
            String[] fruitSplit=fruitNames.split(",");
            fruits.addAll(List.of(fruitSplit));
        }
//        ArrayList<String> fruitsList = new ArrayList<String>(fruits);
        for(String s:fruits){
            if(searchFruitInListIgnoreCase(tempFruits, s)==-1){
                tempFruits.add(s);
            }
        }
        return tempFruits;
    }

    public static int searchFruitInList(List<String> fruitList, String searchFruit) {
        int index=-1;
        if(searchFruit==null || searchFruit==""||fruitList==null ||fruitList.equals("")){
            index=-1;
        }
        else{
            if(fruitList.contains(searchFruit)){
                index=fruitList.indexOf(searchFruit);
            }
        }
        return index;
    }

    public static int searchFruitInListIgnoreCase(List<String> fruitList, String searchFruit) {
        int index=-1;
        if(searchFruit==null || searchFruit==""||fruitList==null ||fruitList.equals("")){
            index=-1;
        }
        else{
            for(String fruits:fruitList){
                if(fruits.equalsIgnoreCase(searchFruit)){
                    index=fruitList.indexOf(fruits);
                }
            }
        }
        return index;
    }
}