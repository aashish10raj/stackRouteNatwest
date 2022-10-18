package com.stackroute.collections;

import java.util.*;

public class UniqueWordExtractor {
    public UniqueWordExtractor() {
    }

    public Set<String> fetchUniqueWordsInOrder(String Paragraph, Comparator<String> inputOrder)
    {
        Set<String>outputRes;
        if(Paragraph==null)
        {
            outputRes=new LinkedHashSet<>();
        }
        else
        if(inputOrder==SortOrder.INPUT_ORDER || inputOrder==null)
        {
            String replaceString=Paragraph.replaceAll("[,.]","");
            String[] splitString=replaceString.split(" ");
            outputRes=new LinkedHashSet<>(Arrays.asList(splitString));
        }
        else {
            String replaceString=Paragraph.replaceAll("[,.]","");
            String[] splitString=replaceString.split(" ");
            outputRes = new TreeSet<>(inputOrder);
            for(String s:splitString)
            {
                outputRes.add(s);
            }
        }
        return outputRes;
    }
}
