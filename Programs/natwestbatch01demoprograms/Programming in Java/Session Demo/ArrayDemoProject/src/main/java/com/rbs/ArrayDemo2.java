package com.rbs;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int m2[][]=new int[2][3];

        m2[0][0]=10;
        m2[0][1]=20;
        m2[0][2]=30;

        m2[1][0]=40;
        m2[1][1]=50;
        m2[1][2]=60;

        for(int i=0; i< m2.length; i++){

            for(int j=0; j<m2[i].length; j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
