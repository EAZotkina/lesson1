package ru.geekbrains.lesson11;

public class Apple extends Fruit {
    private static final float appleWeight = 1.0f;

    public static float getAppleWeight() {
        return appleWeight;
    }
    @Override
    float getWeight(){

        return 1.0f;
    }
}

