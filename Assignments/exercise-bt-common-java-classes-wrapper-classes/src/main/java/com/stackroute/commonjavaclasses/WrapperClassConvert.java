package com.stackroute.commonjavaclasses;

public class WrapperClassConvert {

    //write logic to determine and convert given primitive type to its wrapper class and return result
    public Object convertToWrapper(Object input) {

        if(input instanceof Character)
            return input;
        if(input instanceof Boolean)
            return input;
        if(input instanceof Integer)
            return input;
        if(input instanceof Float)
            return input;
        if(input instanceof Double)
            return input;
        if(input instanceof Long)
            return input;
        if(input instanceof Short)
            return input;
        if(input instanceof Byte)
            return input;
        else if(input==null)
            return "Give proper primitive type as input";
        else
            return "Give proper primitive type as input";

    }
}

