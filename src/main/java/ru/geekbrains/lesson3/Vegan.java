package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Vegan {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int i = (int) (Math.random() * words.length);
        String randomWord = words[i];
        veganFood(randomWord);
    }

        public static void veganFood (String randomWord){


            String[] result = {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"};
            char resultChar;

            Scanner sc = new Scanner(System.in);
            System.out.println("What does the vegan eat today? ");


            String userAnswer = sc.next();

                if (userAnswer.equals(randomWord)) {
                    System.out.println("Wow! Congratulations! You guessed!");

                } else {

                    for (int j = 0; j <= 14; j++) {
                        if (j > randomWord.length() - 1) {
                            resultChar = '#';
                            result[j] = Character.toString(resultChar);
                            break;
                        }
                        if (j > userAnswer.length() - 1) {
                            resultChar = '#';
                            result[j] = Character.toString(resultChar);
                            break;

                        } else {
                            char a = randomWord.charAt(j);
                            char b = userAnswer.charAt(j);
                            if (a == b) {
                                resultChar = a;
                            } else {
                                resultChar = '#';
                            }
                            result[j] = Character.toString(resultChar);


                    }
                }
                    System.out.println(Arrays.toString(result));
                    System.out.println("Try again");
                    veganFood(randomWord);
            }
        }

    }


// * Создать массив из слов
//String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться:
//String str = "apple";
//char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово.
//Используем только маленькие буквы.






