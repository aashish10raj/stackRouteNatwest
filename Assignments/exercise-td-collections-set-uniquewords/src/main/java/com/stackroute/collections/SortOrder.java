package com.stackroute.collections;

import java.util.Comparator;

public class  SortOrder {
    public static final Comparator<String> INPUT_ORDER = String::compareTo;

    public static final Comparator<String> ALPHABETIC_ASCENDING = Comparator.naturalOrder();

    public static final Comparator<String> ALPHABETIC_DESCENDING = Comparator.reverseOrder();

    public static final Comparator<String> LENGTH_THEN_ALPHABETIC_ASCENDING = (s1, s2) -> {
        if (s1.length()!=s2.length()) {
            return s1.length()-s2.length();
        }
        return s1.compareTo(s2);
    };
}
