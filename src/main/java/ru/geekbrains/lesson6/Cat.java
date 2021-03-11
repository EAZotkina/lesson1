package ru.geekbrains.lesson6;

public class Cat extends Animals{
    private final int distanceMaxRun = 200;
    private final int distanceMaxSwim = 0;
    private static int catCount = 0;

    public Cat(){
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(String name, int distance) {
        if (distance > distanceMaxRun) {
            System.out.println(name + " столько не пробежит");
        }else {
        super.run(name,distance);
        }
       }

    @Override
    public void swim (String name, int distance) {
        if (distance > distanceMaxSwim) {
            System.out.println( name + " не умеет плавать");
        } else {
            super.swim (name,distance);
        }
    }
}
