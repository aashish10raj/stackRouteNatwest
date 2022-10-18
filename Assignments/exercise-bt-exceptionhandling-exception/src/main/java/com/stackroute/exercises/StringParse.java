package com.stackroute.exercises;


public class StringParse {
    //Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) {
        char a;
        try{
            int loc=Integer.parseInt(location);
            a=sentence.charAt(loc);
            return a;
        }
        catch ( StringIndexOutOfBoundsException e){
            throw new StringIndexOutOfBoundsException("StringIndexOutOfBoundsException");
        }
        catch (NumberFormatException ex){
            throw new NumberFormatException("NumberFormatException");
        }

    }
}