package com.sun.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args){

        //SubAnimal stringAnimal = new SubAnimal();
        SubAnimal<String> stringAnimal = new SubAnimal();
        stringAnimal.setSex("female");

        //Integer[] list={22,33,44,55};
        //Animal.show(list);

        List<Animal> animals = new ArrayList<>();
        List<SubAnimal> subAnimals = new ArrayList<>();
        animals.add(new Animal<>());
        subAnimals.add(new SubAnimal());

        List<?> some = new ArrayList<>();
        some = animals;//List<Animal>可以转换到List<?>
        Object o = some.get(0);
        System.out.println("some"+some);
        System.out.println("取出来的元素"+o);
        some = subAnimals;//List<SubAnimal>可以转换到List<?>
        System.out.println("some"+some);

        List<? extends Animal> some2 = new ArrayList<>();
        //some2.add(new Animal());//不支持添加，因为不能确定是Animal类
        //some2.add(new SubAnimal());//不支持添加，因为不能确定是Animal类
        //some2.add(new Object());//不支持添加，因为不能确定是Animal类
        some2 = animals;
        Animal o2 = some2.get(0);
        System.out.println("取出来的元素"+o2);

        List<? super Animal> some3 = new ArrayList<>();
        //List<? super Animal> some3 = new ArrayList<SubAnimal>();//报错，因为最低必须是Animal类
        some3.add(new Animal());
        some3.add(new SubAnimal());
        //some3.add(new Object());//报错，只支持Animal类型
        some3 = animals;
        //some3 = subAnimals;//报错，最低是Animal
        Object o3 = some3.get(0);
        System.out.println("取出来的元素"+o3);

    }
}
