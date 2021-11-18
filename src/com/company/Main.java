package com.company;


import com.company.animals.Cat;
import com.company.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog sharik = new Dog(30, 50);
        Dog spotti = new Dog(20, 5);
        Cat salem = new Cat(40, 70);

        System.out.println(sharik);
        System.out.println(spotti);
        System.out.println(salem);
    }


}
