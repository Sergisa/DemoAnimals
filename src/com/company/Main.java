package com.company;


import com.company.animals.Animal;
import com.company.animals.Cat;
import com.company.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Animal sharik = new Dog(30, 50);

        Dog spotti = new Dog(20, 5);
        Cat salem = new Cat(40, 70);


        sharik.eat("meat");
        spotti.eat("fish");
        salem.eat("fish");

        Animal someAnimal = new Animal(10, 20) {
            @Override
            public void walk() {

            }
        };
    }

}
