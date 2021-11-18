package com.company;


import com.company.animals.Cat;
import com.company.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog sharik = new Dog(30, 50);
        Dog spotti = new Dog(20, 5);
        Cat salem = new Cat(40, 70);

        Feedable someFeeadable = new Feedable() {
            @Override
            public void eat(String food) {
                System.out.println("Кто-то выполняет действие ЕСТЬ");
            }

            @Override
            public void doSth() {

            }
        };

        sharik.eat("meat");
        spotti.eat("fish");
        salem.eat("fish");
        someFeeadable.eat("coffe");


        feed(spotti);
        feed(salem);
        feed(someFeeadable);
        feed(new Feedable() {
            @Override
            public void eat(String food) {

            }

            @Override
            public void doSth() {

            }
        });
    }

    public static void feed(Feedable someFeeadableCreature) {
        someFeeadableCreature.eat("");
        someFeeadableCreature.doSth();
    }

}
