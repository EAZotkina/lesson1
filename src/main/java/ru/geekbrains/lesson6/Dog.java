package ru.geekbrains.lesson6;

public class Dog extends Animals{
    private static int dogCount = 0;

    public Dog(){
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

}
