package com.stackroute.exception;

public class InsufficientFundException extends Exception{

    public InsufficientFundException(String exceptionMessage) {
        super(exceptionMessage);
    }
}