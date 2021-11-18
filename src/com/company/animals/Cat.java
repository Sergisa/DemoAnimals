package com.company.animals;

public class Cat extends Animal {
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

    public void walk() {

    }
}
