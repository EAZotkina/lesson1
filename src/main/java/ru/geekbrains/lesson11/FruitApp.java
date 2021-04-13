package ru.geekbrains.lesson11;

public class FruitApp {

    public static void main(String[] args) {
        // создаем 2 коробки: 1 коробка с 20 апельсинами и 2 коробка с 30 яблоками.

        Box<Orange> orangeBox = new Box<>(Orange.getOrangeWeight(),20);
        Box<Apple> appleBox = new Box<>(Apple.getAppleWeight(),30);

        // в 1 коробку с 20 апельсинами добавляем 10 апельсинов,
        // во 2 коробку с 30 яблоками добавляем 30 яблок.
        orangeBox.addFruit(new Orange(),10);
        appleBox.addFruit(new Apple(),30);

        // взвешиваем коробки

        System.out.println("Вес коробки с апельсинами: "+ orangeBox.getWeight(orangeBox));
        System.out.println("Вес коробки с яблоками: "+ appleBox.getWeight(appleBox));

        // создаем другую коробку с 40 апельсинами

       Box<Orange> anotherOrangeBox = new Box<>(Orange.getOrangeWeight(),40);

        // сравниваем веса коробок: true – если их массы равны, false в противоположном случае

        System.out.println(orangeBox.compare(orangeBox,anotherOrangeBox));
        System.out.println(appleBox.compare(appleBox,anotherOrangeBox));

        // пересыпем апельсины из новой коробки в 1 коробку и снова взвесим

        orangeBox.pourFruit(orangeBox,anotherOrangeBox);
        System.out.println("В коробке стало "+ orangeBox.getBoxFruitAmount() + " фруктов.\n");
        System.out.println("Вес коробки с апельсинами: "+ orangeBox.getWeight(orangeBox));

    }
}
//Задача:
//        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//        Класс Box, в который можно складывать фрукты. Коробки условно
//        сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        Для хранения фруктов внутри коробки можно использовать ArrayList;
//        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//        Не забываем про метод добавления фрукта в коробку.
