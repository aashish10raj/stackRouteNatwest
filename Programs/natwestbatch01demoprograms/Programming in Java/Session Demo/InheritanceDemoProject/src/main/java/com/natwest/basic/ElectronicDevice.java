package com.natwest.basic;

class MLIImpl{
    public static void main(String[] args) {
        LEDTV tv=new LEDTV();
        tv.display();
        tv.switchOn();
        tv.switchOff();
    }
}

public class ElectronicDevice {
    public void display() {
        System.out.println("Electronic Device");
    }
}

class Television extends ElectronicDevice{
    public void switchOn(){
        System.out.println("Welcome ! Ram");
    }
}

class LEDTV extends Television{
    public void switchOff(){
        System.out.println("See you again");
    }
}
