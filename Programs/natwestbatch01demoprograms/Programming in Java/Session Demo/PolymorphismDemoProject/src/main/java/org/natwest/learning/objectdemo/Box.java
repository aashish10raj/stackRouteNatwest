package org.natwest.learning.objectdemo;

class EqualsDemoImpl{
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box();

        if(b1.equals(b2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");
    }
}

public class Box {
    int num1, num2, num3;

    public Box() {
    }

    //    public Box(int num1, int num2, int num3) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.num3 = num3;
//    }
                            // b2
    public boolean equals(Object o){
                  // b2
        Box b3= (Box) o; // DownCasting
        if(num1==b3.num1&&num2==b3.num2&&num3==b3.num3){
            return true;
        }else{
            return false;
        }
    }
}
