package com.sun.generics;

public class Animal<T> {

    private String name;
    private int age;
    private T sex;

    public static <E> void show(E[] list){
        for (E i:list) {
            System.out.println(i);
        }
    }

    public Animal() {
    }

    public Animal(String name, int age, T sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getSex() {
        return sex;
    }

    public void setSex(T sex) {
        this.sex = sex;
    }


}
