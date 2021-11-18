package com.company.animals;

public abstract class Animal {
    int height, weight;

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void eat(String food) {

    }

    abstract public void walk();
}
