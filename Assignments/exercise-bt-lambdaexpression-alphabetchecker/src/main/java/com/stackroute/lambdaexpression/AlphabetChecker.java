//package com.stackroute.lambdaexpression;
//
//import java.util.List;
//
//public class AlphabetChecker {
//    //write logic to find whether given string contains only alphabets or not
//    public String checkAlphabets(List<String> inputList) {
//
//         if (inputList.isEmpty()) {
//            return "Give proper input not empty list";
//        } else for (int i = 0; i < inputList.size(); i++) {
//             if (inputList.get(i).chars().allMatch(Character::isLetter) || inputList.get(i).chars().equals(" ") || inputList.get(i).chars()==null) {
//                 return "Given list contains only alphabet strings";
//
//             } else
//                 return "Given list contains non alphabet strings";
//         }
//        return null;
//    }
//}
package com.stackroute.lambdaexpression;

import java.util.List;

public class AlphabetChecker {
    //write logic to find whether given string contains only alphabets or not
    public String checkAlphabets(List<String> inputList) {

        if(inputList == null || inputList.isEmpty()) return "Give proper input not empty list";

        boolean alpha = inputList.stream().allMatch((x) -> (x.chars().allMatch(Character::isLetter)));

        if(alpha)
            return "Given list contains only alphabet strings";

        return "Given list contains non alphabet strings";

    }
}