package ru.geekbrains.lesson6;

public abstract class Animals {
    private static int animalsCount = 0;

    public Animals(){
        animalsCount++;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public void run(String name, int distance,int distanceMaxRun) {
        if (distance > distanceMaxRun) {
            System.out.println(name + " столько не пробежит");
        }else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }
    public void swim(String name, int distance, int distanceMaxSwim) {
        if (distance > distanceMaxSwim) {
            System.out.println(name + " столько не проплывет");
        }else {
            System.out.println(name + " проплыл " + distance + " м.");
        }
      }
    }


