package ru.geekbrains.lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;

    }
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public String getEmail() {
        return email;
    }
    public String getTel() {
        return tel;
    }

    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    //метод, который выводит информацию об объекте в консоль.
    public void infoEmployee ( ) {
        System.out.println("Сотрудник ФИО: " + getName() + ". Занимаемая должность: " + getPosition() + ". Контакты: " + getEmail() + "; " + getTel() + ". Заработная плата: " + getSalary() + ". Возраст: " + getAge() + ".");
        }

        //сотрудники старше 40 лет.
    public void oldEmployee (int old ) {
        if (getAge() > old) {
            System.out.println("Сотрудник ФИО: " + getName() + ". Занимаемая должность: " + getPosition() + ". Контакты: " + getEmail() + "; " + getTel() + ". Заработная плата: " + getSalary() + ". Возраст: " + getAge() + ".");
        }
    }


}






//    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        Конструктор класса должен заполнять эти поля при создании объекта.
//        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//        С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
