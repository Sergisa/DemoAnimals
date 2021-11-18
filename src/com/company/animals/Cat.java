package com.company.animals;

import com.company.Feedable;

public class Cat extends Animal implements Feedable {
    private final String color = "white";
    public Cat(int height, int w) {
        super(height, w);

    }

    @Override
    public String toString() {
        return super.toString() + this.height + " " + this.weight + this.color;
        //return this.height + " " + this.weight;
    }
    public void eat(String food){
        System.out.println("Animal eats" + food);
    }

    @Override
    public void doSth() {

    }
}
