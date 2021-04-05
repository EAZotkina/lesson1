package ru.geekbrains.lesson11;
import java.util.Arrays;

public class MethodArrayApp {

    public static void main(String[] args) {

        String[] arr1 = {"abc", "bcd", "cde"};
        Integer[] arr2 = {1, 2, 3};
        changePlaces(arr1, 1, 2);
        changePlaces(arr2, 0, 1);

    }

    public static <T> T[] changePlaces(T[] arr, int n1, int n2) {
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        T chPl = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = chPl;
        System.out.println("Массив после замены мест " + n1 + " на " + n2 + " : " + Arrays.toString(arr));
        return arr;
    }

}

//    Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);



