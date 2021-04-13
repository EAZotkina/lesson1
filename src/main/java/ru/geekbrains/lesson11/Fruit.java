package ru.geekbrains.lesson11;

public abstract class Fruit {
    private int fruitAmount;
    abstract float getWeight();

    public int getFruitAmount() {
        return fruitAmount;
    }
}
