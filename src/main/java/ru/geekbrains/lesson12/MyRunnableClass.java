package ru.geekbrains.lesson12;

import java.util.Arrays;

public class MyRunnableClass implements Runnable {

    private static final int SIZE = 10_000_000;
    private static final int HALF = SIZE / 2;


    public static void main(String[] args) {
        MyRunnableClass calculateArray = new MyRunnableClass();

        calculateArray.run1Thread();
        calculateArray.run2Threads();

        }

    public float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    public void run1Thread() {

        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1.0f);

        long a = System.currentTimeMillis();
        calculate(arr);
        System.out.println("Массив посчитается одним потоком за " + (System.currentTimeMillis() - a));
    }

    public void run2Threads() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        Arrays.fill(arr, 1.0f);

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        new Thread(() -> {
            float[] a1 = calculate(arr1);
            System.arraycopy(a1, 0, arr1, 0, a1.length);
        })
                .start();


        new Thread(() -> {
            float[] a2 = calculate(arr2);
            System.arraycopy(a2, 0, arr2, 0, a2.length);
        }).start();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        System.out.println("Массив посчитается двумя потоками за " + (System.currentTimeMillis() - a));
    }


    @Override
    public void run() {

    }
}


//    Необходимо написать два метода, которые делают следующее:
//        1) Создают одномерный длинный массив, например:
//        2) Заполняют этот массив единицами.
//        3) Засекают время выполнения: long a = System.currentTimeMillis().
//        4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
//        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//        5) Проверяется время окончания метода System.currentTimeMillis().
//        6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
//
//        Отличие первого метода от второго:
//        Первый просто бежит по массиву и вычисляет значения.
//        Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
//        Пример деления одного массива на два:

//        Примечание:
//        System.arraycopy() — копирует данные из одного массива в другой:
//        System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
//        По замерам времени:
//        Для первого метода надо считать время только на цикл расчета:
//        for (int i = 0; i < size; i++) {
//        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//        }
//
//
//        Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.

