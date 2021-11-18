package com.company.animals;

public class Dog extends Animal {
    public Dog(int height, int w) {
        super(height, w);
    }

    public void doSth(){

    }

    public void eat(String food){
        System.out.println("Animal eats" + food);
    }

    @Override
    public void walk() {

    }
}
