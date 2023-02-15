package com.sun.arraydemo;

public class Array2DDeclare {

    public static void main(String[] args){
        int[][] aArray;
        int bArray[][];

        aArray = new int[3][4];
        aArray[0][0] = 2;
        aArray[0][1] = 2;
        System.out.println(aArray.length);//只会取行的长度

        double[][] cArray = new double[2][2];
        System.out.println(cArray[0][0]);

        int[][] dArray = new int[][]{{1,2,3},{4,5,6}};
        int[][] eArray = {{7,8,9},{10,11,12}};
    }
}
