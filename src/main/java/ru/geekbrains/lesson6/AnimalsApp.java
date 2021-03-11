package ru.geekbrains.lesson6;

public class AnimalsApp {
    public static void main(String[] args) {
       Cat cat1 = new Cat();
       cat1.run("Мурзик", 130);
       cat1.swim("Мурзик", 138);

       Cat cat2 = new Cat();
       cat2.run("Пиксель", 500);
       cat2.swim("Пиксель", 1);

       Dog dog = new Dog();
       dog.run ("Тоби", 400);
       dog.swim ("Тоби", 3);

        System.out.println("Всего животных: " + Animals.getAnimalsCount());
        System.out.println("Из них котов: "+ Cat.getCatCount()+ "\nИз них собак: " + Dog.getDogCount() + ".");

    }

}
