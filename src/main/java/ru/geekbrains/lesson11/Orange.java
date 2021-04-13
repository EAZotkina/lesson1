package ru.geekbrains.lesson11;

public class Orange extends Fruit{

    private static final float orangeWeight = 1.5f;

    public static float getOrangeWeight() {
        return orangeWeight;
    }

    @Override
    float getWeight(){

        return 1.5f;
    }
}
