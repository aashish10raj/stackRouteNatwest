package com.rbs;

public class ArrayDemo4 {
    public static void main(String[] args) {
        String player[]={"Sachin","Saurav","Rahul","Viru","Dhoni"};
     //   System.out.println(player[2]);
        player[0]="Rohith";

//        for(int i=0;i< player.length;i++){
//            System.out.println(player[i]);
//        }
        for(String name:player){
            System.out.println(name);
        }
    }
}
