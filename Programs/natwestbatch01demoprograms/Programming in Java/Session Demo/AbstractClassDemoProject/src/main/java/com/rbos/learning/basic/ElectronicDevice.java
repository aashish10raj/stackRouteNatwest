package com.rbos.learning.basic;

class TestImpl{
    public static void main(String[] args) {
        LEDTV ledtv=new LEDTV();
        ledtv.switchOn();
        ledtv.switchOff();

    }
}

public abstract class ElectronicDevice {
    abstract  void switchOn();
    abstract  void switchOff();
}
abstract class Television extends ElectronicDevice{

    void switchOn(){

    }

}
class LEDTV extends Television{

    void switchOff(){

    }

}