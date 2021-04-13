package ru.geekbrains.lesson8;

public class Human implements Competitor {

    private final int MAXRUN = 5000;
    private final int MAXJUMP = 2;

    public Human() {
    }

    @Override
    public void run(int distantRun) {
        if (distantRun <= MAXRUN) {
            System.out.println("Человек пробежал " + distantRun);
        }else {
            System.out.println("Человек не смог пробежать " + distantRun);
        }
    }

    @Override
    public void jump(int heightJump) {
        if (heightJump <= MAXJUMP) {
            System.out.println("Человек перепрыгнул стену высотой " + heightJump);
        } else {
            System.out.println("Человек не смог перепрыгнуть стену высотой " + heightJump);
        }
    }
}
