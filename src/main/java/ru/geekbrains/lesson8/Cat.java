package ru.geekbrains.lesson8;

public class Cat implements Competitor {
    private final int MAXRUN = 10000;
    private final int MAXJUMP = 4;

    public Cat() {
    }

    @Override
    public void run(int distantRun) {
        if (distantRun <= MAXRUN) {
            System.out.println("Кот пробежал " + distantRun);
        }else {
            System.out.println("Кот не смог пробежать " + distantRun);
        }
    }

    @Override
    public void jump(int heightJump) {
        if (heightJump <= MAXJUMP) {
            System.out.println("Кот перепрыгнул стену высотой " + heightJump);
        } else {
            System.out.println("Кот не смог перепрыгнуть стену высотой " + heightJump);
        }
    }
}


