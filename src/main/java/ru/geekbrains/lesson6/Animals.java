package ru.geekbrains.lesson6;

public class Animals {
    private static int animalsCount = 0;

    public Animals(){
        animalsCount++;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public void run(String name, int distance) {
        System.out.println(name + " пробежал " + distance + " м." );

    }
    public void swim(String name, int distance) {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }

