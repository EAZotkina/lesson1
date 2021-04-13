package ru.geekbrains.lesson10;

public class PhonebookApp {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов И.И.", "89153452637");
        phonebook.add("Иванов И.И.", "89163452947");
        phonebook.add("Петров П.П.", "89352673546");
        phonebook.add("Сидоров С.С.", "89463562736");

        phonebook.printPhonebook();

        phonebook.get("Иванов И.И.");
        phonebook.get("Павлов И.И.");

        }

    }

