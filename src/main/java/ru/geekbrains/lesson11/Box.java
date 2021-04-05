package ru.geekbrains.lesson11;

import java.util.ArrayList;

public class Box <T extends Fruit > {
    private final float fruitWeight;
    private int boxFruitAmount;

    public int getBoxFruitAmount() {
        return boxFruitAmount;
    }

    private final ArrayList<T> box = new ArrayList<>();

    public Box(float fruitWeight, int fruitAmount) {
        this.fruitWeight = fruitWeight;
        this.boxFruitAmount = fruitAmount;
    }

    public float getWeight(Box<T> box) {
        return box.fruitWeight * box.boxFruitAmount;
    }

    public boolean compare(Box<T> box, Box anotherBox) {
        return getWeight(box) == getWeight(anotherBox);
    }

    public void pourFruit(Box<T> box, Box <T> anotherBox) {
        box.boxFruitAmount += anotherBox.boxFruitAmount;
        anotherBox.boxFruitAmount -= anotherBox.boxFruitAmount;
    }

    public void addFruit(T fruit, int fruitAmount) {
        box.add(fruit);
        boxFruitAmount += fruitAmount;
    }

}










