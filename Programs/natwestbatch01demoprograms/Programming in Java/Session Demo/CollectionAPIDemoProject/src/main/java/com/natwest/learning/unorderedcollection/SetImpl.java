package com.natwest.learning.unorderedcollection;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Engineer");
        set.add("Doctor");
        set.add("Mentor");
        set.add("Singer");
        set.add("Musician");

        set.add("Doctor"); // Duplicate will not be accepted

        for(String str:set){
            System.out.println(str);
        }
    }
}
