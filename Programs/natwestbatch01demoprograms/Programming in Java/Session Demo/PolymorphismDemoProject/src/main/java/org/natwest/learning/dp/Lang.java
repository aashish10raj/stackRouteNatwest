package org.natwest.learning.dp;

class InstanceOfImpl{
    public static void main(String[] args) {
        Lang l1=new C();
        Lang l2=new Java();

        if(l1 instanceof C)
            l1.display();
        if(l2 instanceof Java)
            l2.display();
    }
}

public class Lang {
    public void display(){
        System.out.println("Computer Language");
    }
}
class C extends Lang{
    @Override
    public void display() {
        System.out.println("Procedural Language");
    }
}
class Java extends Lang{
    @Override
    public void display() {
        System.out.println("OOP Language");
    }
}
