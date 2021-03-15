package ru.geekbrains.lesson6;

public class Cat extends Animals {

    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }
}