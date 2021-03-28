package ru.geekbrains.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Phonebook {
    private final HashMap<String, List<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String surname, String tel) {
        List<String> num = new ArrayList<>();

        if (this.phonebook.containsKey(surname)) {
            num = this.phonebook.get(surname);
            num.add(tel);
            this.phonebook.put(surname, num);
        } else {
            num.add(tel);
            this.phonebook.put(surname, num);
        }
    }

    public String get(String surname) {
        String result;
        if (this.phonebook.containsKey(surname)) {
            result = "Телефон клиента " + surname + ": " +
                    this.phonebook.get(surname).toString();
        } else {
            result = "Клиента " + surname + " нет в справочнике";
        }
        System.out.println(result);
        return result;
    }

    public void printPhonebook() {
        System.out.println("Телефонный справочник: ");
        this.phonebook.forEach((surname, tel) -> System.out.println(surname + "" + tel));
    }
}

////    Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
////    телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи,
////    а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
////    может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
////    выводиться все телефоны.