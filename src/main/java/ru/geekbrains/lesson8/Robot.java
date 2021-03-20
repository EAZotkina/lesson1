package ru.geekbrains.lesson8;

public class Robot implements Competitor{
    private int MAXRUN = 10000;
    private int MAXJUMP = 10000;


    public Robot() {
    }

    @Override
    public void run(int distantRun) {
        if (distantRun <= MAXRUN) {
            System.out.println("Робот пробежал " + distantRun);
        }else {
            System.out.println("Робот не смог пробежать " + distantRun);
        }
    }

    @Override
    public void jump(int heightJump) {
        if (heightJump <= MAXJUMP) {
            System.out.println("Робот перепрыгнул стену высотой " + heightJump);
        } else {
            System.out.println("Робот не смог перепрыгнуть стену высотой " + heightJump);
        }
    }
}


