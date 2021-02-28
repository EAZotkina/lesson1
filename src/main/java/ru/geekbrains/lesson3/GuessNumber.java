package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        guessNumber();

    }
        //Написать программу, которая загадывает случайное число от 0 до 9 и пользователю
        // дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
        // больше ли указанное пользователем число, чем загаданное, или меньше. После победы
        // или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
        // (1 – повторить, 0 – нет).


    private static void guessNumber(){

            int randomNumber = (int) (Math.random() * 10);
            Scanner sc = new Scanner(System.in);

            for (int tryCount = 1; tryCount <= 3; tryCount++){
                System.out.println("Введите число от 0 до 9: " );
                int userNumber = sc.nextInt();
                if (userNumber == randomNumber) {
                    System.out.println("Поздравляю! Вы угадали!");
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    int userChoice = sc.nextInt();
                    if (userChoice == 1) {
                        guessNumber();

                    }else {
                        break;
                    }
                }else if (userNumber < randomNumber) {
                    System.out.println("Загаданное число больше.");
                }else {
                    System.out.println("Загаданное число меньше.");

                }

                if(tryCount == 3) {
                    System.out.println();
                    System.out.println("Попытки закончились. Вы проиграли!\nЗагаданное число " + randomNumber);
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    int userChoice = sc.nextInt();
                    if (userChoice == 1) {
                        guessNumber();

                    }else {
                        System.out.println("Игра окончена.");
                        break;
                    }
                }
            }
        }
    }

