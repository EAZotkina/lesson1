package ru.geekbrains.lesson10;

import java.util.*;

public class Names {

    public static void main(String[] args) {

        ArrayList<String> names20 = new ArrayList<>();
        names20.add("Василий");
        names20.add("Пётр");
        names20.add("Антон");
        names20.add("Дмитрий");
        names20.add("Константин");
        names20.add("Сергей");
        names20.add("Илья");
        names20.add("Даниил");
        names20.add("Антон");
        names20.add("Матвей");
        names20.add("Дмитрий");
        names20.add("Василий");
        names20.add("Василий");
        names20.add("Сергей");
        names20.add("Павел");
        names20.add("Василий");
        names20.add("Олег");
        names20.add("Вениамин");
        names20.add("Сергей");
        names20.add("Василий");


        System.out.println("Список мужских имён:\n");
        Set<String> uniqueNames = new HashSet<>(names20);
        System.out.println(uniqueNames + "\n");

        for (String name : uniqueNames) {
            System.out.println(name + " в списке встречается " + Collections.frequency(names20, name) + " раз.");
        }
    }
}

//        Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//        Посчитать, сколько раз встречается каждое слово.

