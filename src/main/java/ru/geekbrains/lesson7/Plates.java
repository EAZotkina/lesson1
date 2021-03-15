package ru.geekbrains.lesson7;

public class Plates {
    private int food;

    public Plates(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void decreaseFood(int n) {
        if (n <= food) {
            food -= n;
        }
    }

    public void addFood (int n) {
        food += n;
    }
        public void info () {
            System.out.println("В тарелке: " + food);
        }
    }

