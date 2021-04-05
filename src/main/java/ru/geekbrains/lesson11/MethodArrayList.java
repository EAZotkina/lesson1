package ru.geekbrains.lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodArrayList {
    public static void main(String[] args) {
        String[] arr1 = {"abc","bcd","cde"};
        Integer[] arr2 = {1,2,3};
        asList(arr1);
        asList(arr2);

    }
    public static <T> void asList(T[] arr){
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Результат преобразования: "  + arrayList);
    }
}
