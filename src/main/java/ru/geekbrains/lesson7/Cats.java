package ru.geekbrains.lesson7;

public class Cats {
    private String name;
    private int appetite;
    private boolean full;

    public Cats(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }
    public Cats() {
    }

    public int getAppetite() {
        return appetite;
    }
    public void eat(Plates p) {
        p.decreaseFood(appetite);

    }
    public boolean isFull() {
        full = true;
        return full;
    }

     public void catInfo () {
        if (full == true) {
            System.out.println(name + " поел и сыт");
        } else {
            System.out.println(name + " остался голоден");
        }
    }
}
