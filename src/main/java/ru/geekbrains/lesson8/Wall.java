package ru.geekbrains.lesson8;

public class Wall implements Obstacle {
    private int heightWall = 2;


        public Wall(int heightWall) {
            this.heightWall = heightWall;

        }

        public Wall() {
        }
    @Override
    public boolean run(int distantRun) {
        return true;
    }

    @Override
    public boolean jump (int heightJump) {
        return true;
    }
        public int getHeightWall() {
            return heightWall;
        }
}
