package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Construction {

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr1);
        fillArray();
        changeArray();
        fillDiagonal(9);
        minMax();
        checkBalance();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        changePlace(arr, -4);
    }


    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;


    public static void invertArray(int[] arr1) {


        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        System.out.println("Задание 1. ");
        System.out.println(Arrays.toString(arr1));
        System.out.println();
    }


    //Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;


    public static void fillArray() {
        int[] arr;
        arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i] + 3;
        }


        System.out.println("Задание 2. ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }


    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;

    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }


        }
        System.out.println("Задание 3. ");
        System.out.println(Arrays.toString(w));
        System.out.println();
    }


    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void fillDiagonal(int n) {
        System.out.println("Задание 4. ");


        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }

                System.out.print(arr[i][j]);
            }

            System.out.println();
        }
        System.out.println();
    }


//** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    public static void minMax() {
        System.out.println("Задание 5. ");

        int[] mm = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9};
        int min = mm[0];
        int max = mm[0];
        for (int i = 0; i < mm.length - 1; i++) {

            if (min > mm[i]) {
                min = mm[i];

            }
            if (max < mm[i]) {
                max = mm[i];

            }
        }


        System.out.println("Минимальный элемент " + min);
        System.out.println("Максимальный элемент " + max);
        System.out.println();
    }

//** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.

    public static boolean checkBalance() {
        System.out.println("Задание 6. ");

        boolean balance = false;

        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};

        // найдем сумму чисел в массиве
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // сумма в левой части

        int sumLeft = 0;
        for (int j = 0; j < arr.length; j++) {
            sumLeft += arr[j];
            // сравниваем сумму в левой части и в правой
            if (sumLeft == sum - sumLeft) {
                balance = true;
                System.out.println("Найден баланс после элемента " + j + ". Сумма равна " + sumLeft + ".");

            }

        }
        return balance;

    }


//**** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить все
// элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
// нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
// (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.


    public static int[] changePlace(int[] arr, int n) {
        System.out.println();
        System.out.println("Задание 7. НЕ РЕШИЛА.");

        int place1, place2, buffer;

        for (int i = 0; i < arr.length; i++) {
            buffer = arr[i];
            place1 = i;

            if (n > 0) {
                place2 = place1 + n;
                    if (place2 >= arr.length)
                        place2 = place2 - arr.length;

                    if (place2 == i)
                        break;

                    arr[place1] = arr[place2];
                    place1 = place2;


            } else if(n < 0) {

                    place2 = place1 + n;
                    if (place2 < 0)
                        place2 = place2 + arr.length;
                        if (place2 == i)
                            break;

                        arr[place1] = arr[place2];
                        place1 = place2;


                }
            arr[place1] = buffer;

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();

        return arr;
    }


}




