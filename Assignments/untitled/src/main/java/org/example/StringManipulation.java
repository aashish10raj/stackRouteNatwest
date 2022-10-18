package org.example;

public class StringManipulation {
    public int vowelCount(String name) {
        int count = 0;
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            //Checks whether a character is a vowel
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                //Increments the vowel counter
                count++;
            }

        }
        return count;
    }

    public int characterCount(String str){
        int count=0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }
        return count;
    }
}
