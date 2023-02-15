package com.sun.exceptionhanding;

public class MultipleExceptionSingleCatch {

    public static void main(String[] args){
        try{
            String test =  null;
            System.out.println(test.length());
            String names[] = {"Test","Exception....."};
            System.out.println(names[1]);
            int result = 0;
            int num1 = 0;
            int num2 = 0;
            result = num1/num2;
            System.out.println("result"+result);
        }catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException exception){
            if( exception instanceof  NullPointerException){
                System.out.println("Check Object for null");
            }else if( exception instanceof ArithmeticException){
                System.out.println("Check numbers to be a non zero value");
            }else if(exception instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Check the index out of bounds");
            }

        }
    }
}
