package com.sun.lambdaexpress;

public class LambdaDemo {

    public static void main(String[] args) {

        //NoArgumentInterface noArgumentInterface = ()->{System.out.println("this is no argument interface");};
        //省略模式
        NoArgumentInterface noArgumentInterface = () -> System.out.println("this is no argument interface");


        //一个参数
        //OneArgumentInterfaceLambda oneArgumentInterfaceLambda = (house)->System.out.println("今天住在"+house+"家");
        //省略模式
        OneArgumentInterfaceLambda oneArgumentInterfaceLambda = house -> System.out.println("今天住在" + house + "家");
        oneArgumentInterfaceLambda.sleep("小蜗");


        //两个参数
        TwoArgumentInterfaceLambda twoArgumentInterfaceLambda1 = ((int a, int b) -> {
            int i = a + b;
            System.out.println("a + b = " + i);
        });
        twoArgumentInterfaceLambda1.add(2, 3);

        //省略模式
        TwoArgumentInterfaceLambda twoArgumentInterfaceLambda2 = ((a, b) -> {
            int i = a + b;
            System.out.println("a + b = " + i);
        });
        twoArgumentInterfaceLambda2.add(2, 3);

        //两个参数加return
        TwoArgumentReturnInterface twoArgumentReturnInterface = (a, b) -> {
            int i = a - b;
            System.out.println("a - b = " + i);
            return i;
        };
        //省略模式
        TwoArgumentReturnInterface twoArgumentReturnInterface1 = (a, b) -> a - b;

        twoArgumentReturnInterface.subInterface(3, 2);
    }
}
