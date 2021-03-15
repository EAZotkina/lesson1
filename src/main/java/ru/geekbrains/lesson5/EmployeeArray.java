package ru.geekbrains.lesson5;

public class EmployeeArray {

    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5]; // Вначале объявляем массив объектов
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231211", 30000, 30);
        employeesArray[1] = new Employee("Petin Petr", "Engineer", "petrov@mailbox.com", "89231231222", 40000, 55);
        employeesArray[2] = new Employee("Vasin Vasiliy", "Engineer", "vasin@mailbox.com", "89231231233", 50000, 45);
        employeesArray[3] = new Employee("Semenov Semen", "Engineer", "semenov@mailbox.com", "89231231244", 60000, 33);
        employeesArray[4] = new Employee("Marinina Marina", "Engineer", "marinina@mailbox.com", "89231231255", 100000, 44);

        System.out.println("Информация о сотруднике:");
        employeesArray[0].infoEmployee( );
        System.out.println();

        System.out.println("Сотрудники старше 40 лет:");
        for(int i = 0; i < employeesArray.length; i++ ) {
        employeesArray[i].oldEmployee(40);

        }
    }

}
