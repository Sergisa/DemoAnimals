package com.company.animals;

import com.company.Feedable;

public class Dog extends Animal implements Feedable {
    public Dog(int height, int w) {
        super(height, w);
    }

    @Override
    public void doSth(){

    }

    public void eat(String food){
        System.out.println("Animal eats" + food);
    }
}
