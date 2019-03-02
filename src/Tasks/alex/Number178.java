package com.company;

import java.util.Scanner;

abstract class Number178 implements Action {
    protected Scanner scanner = new Scanner(System.in);
    protected static int[] genArray(int ii){
        int mat [] = new int [ii];
        System.out.println("початковий список");
        for (int i=0;i<ii;i++ ) {
            mat[i]= (int) (Math.random()*(10+1));
            System.out.println(mat[i]);
        }
        return mat;
    }
}
