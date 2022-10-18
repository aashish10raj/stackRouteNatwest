package com.natwest.learning.mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapImpl {
    public static void main(String[] args) {
        // Phone book ------------> name------------>Phone Number
        Map<String,Long> contactMap=new HashMap<>();
        contactMap.put("Sam",9156776544l);
        contactMap.put("Will",9156778765l);
        contactMap.put("Mark",9156773422l);
        contactMap.put("John",9156777865l);
        contactMap.put("Steve",9156771122l);

        System.out.println(contactMap);
        System.out.println(contactMap.get("Will"));
        System.out.println(contactMap.keySet());
        System.out.println(contactMap.values());
        System.out.println(contactMap.entrySet());
        System.out.println(contactMap.size());
        System.out.println(contactMap.containsKey("Mark"));
        System.out.println(contactMap.containsValue(9156777865l));
        contactMap.remove(new String("Will"));
        System.out.println(contactMap);

        // traversing Map
        Set<Map.Entry<String, Long>> set=contactMap.entrySet();
        System.out.println("Using Iterator");
        Iterator<Map.Entry<String,Long>> iterator= set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Using For Loop ");
        for(Map.Entry<String,Long> me:set){
            System.out.println(me);
        }


    }
}
