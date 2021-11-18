package com.company.animals;

import com.company.Feedable;

public class Animal {
    int height,weight;

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

    public void eat(String food){
        System.out.println("Animal eats" + food);
    }

}
