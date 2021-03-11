package ru.geekbrains.lesson6;

public class Dog extends Animals{
    private final int distanceMaxRun = 500;
    private final int distanceMaxSwim = 10;
    private static int dogCount = 0;

    public Dog(){
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
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
            System.out.println( name + " столько не проплывет");
        } else {
            super.swim (name,distance);
        }
    }

}
