package com.rbs;

public class ArrayDemo3 {

    public static void main(String[] args) {
        int m2[][]=new int[2][];

        m2[0]=new int[2];
        m2[1]=new int[3];

        m2[0][0]=10;
        m2[0][1]=20;

        m2[1][0]=30;
        m2[1][1]=40;
        m2[1][2]=50;
                           // 2
        for(int i=0; i< m2.length; i++){
                               // 3
            for(int j=0; j<m2[i].length; j++){
                System.out.print(m2[i][j]+" ");
                               //  10  20
                               //  30 40 50
            }
            System.out.println();
        }

    }
}
