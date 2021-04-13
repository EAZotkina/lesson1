package ru.geekbrains.lesson9;

public class AppExceptions {
    public static void main(String[] args) {

        String[][] myArrayCorrect = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "4", "a"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println("1 массив\n");
            CheckArray.checkArray(myArrayCorrect);
        }catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
        } finally {
            System.out.println( "Сумма равна: " + CheckArray.getSum());
            System.out.println();

        }


        try {
            System.out.println("2 массив\n");
            CheckArray.checkArray(incorrect);
        }catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println( "Сумма равна: " + CheckArray.getSum());
            System.out.println();

        }


        try {
            System.out.println("3 массив\n");
            CheckArray.checkArray(incorrect2);
        }catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println( "Сумма равна: " + CheckArray.getSum());


        }

    }
}


//    Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
//    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//    Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
//    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
//    или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
//    в какой именно ячейке лежат неверные данные.
//    В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
//    и MyArrayDataException и вывести результат расчета.
