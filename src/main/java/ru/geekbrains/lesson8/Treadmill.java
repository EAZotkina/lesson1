package ru.geekbrains.lesson8;

public class Treadmill implements Obstacle{
    private int distant = 4000;

    public Treadmill(int distant) {
        this.distant = distant;
    }

    public Treadmill() {
    }
    @Override
    public boolean run(int distantRun) {
        return true;
         }

    @Override
    public boolean jump (int heightJump) {
      return true;
    }

    public int getDistant() {
        return distant;
    }
}


