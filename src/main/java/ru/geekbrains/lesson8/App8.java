package ru.geekbrains.lesson8;

public class App8 {

    public static void main(String[] args) {

        Human human = new Human();
        human.run(3000);
        human.jump(3);
        System.out.println();

        Cat cat = new Cat();
        Treadmill treadmill = new Treadmill(7000);
        cat.run(treadmill.getDistant());

        Robot robot = new Robot();
        Wall wall = new Wall(10);
        robot.jump(wall.getHeightWall());

        System.out.println();

        Competitor[] competitor = new Competitor[3];
        competitor[0] = human;
        competitor[1] = cat;
        competitor[2] = robot;

        treadmill = new Treadmill(10000);
        wall = new Wall(5);
        Obstacle[] obstacle = new Obstacle[2];
        obstacle[0] = wall;
        obstacle[1] = treadmill;


        for (int i = 0; i < competitor.length; i++)
             {
                competitor[i].run(treadmill.getDistant());
                competitor[i].jump(wall.getHeightWall());
            }
    }
}







//        Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//        Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//        * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
