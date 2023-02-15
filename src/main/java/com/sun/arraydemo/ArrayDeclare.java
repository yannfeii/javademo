package com.sun.arraydemo;

public class ArrayDeclare {

    public static void main(String[] args){
        int[] aArray;
        int bArray[];

        //基础数据类型
        byte[] byteArray;
        long[] longArray;

        //引用类型
        Object[] objectArray;
        String[] stringArray;

        //动态初始化，初始值（整数类型0，浮点类型0.0，布尔类型false,引用类型null)
        aArray = new int[3];
        //静态初始化
        int[] cAarry = new int[]{1,2,3};
        int[] dAarry = {4,5,6};
        bArray = new int[]{7,8,9};

    }
}
