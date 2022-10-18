package com.natwest.learning.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamImpl2 {
    public static void main(String[] args) {
        List<String> states= Arrays.asList(new String[]{"Karnataka","Kerala","TamilNadu","Andhra Pradesh","Goa","Bihar","Uttar Pardesh","Punjab","Goa","Bihar","Punjab"});

        Predicate<String> statesGTThreeChars=state->state.length()>3;
        long count=states.stream()
//                .filter(statesGTThreeChars) // Intermediate Operation
                .filter(state->state.length()>3) // Intermediate Operation
                .count(); // Terminal Operation
        System.out.println(count);

        states.stream()
                .filter(state->state.length()>3) // I1
                .distinct() // I2
                .sorted()  // I3
                .forEach(System.out::println);


    }
}
