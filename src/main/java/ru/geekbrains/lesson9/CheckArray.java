package ru.geekbrains.lesson9;

public class CheckArray {
    private static int row;
    private static int column;
    private static int sum = 0;

    public static int getSum() {
        return sum;
    }

    public static int checkArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {

        if (myArray.length != 4 || myArray[0].length != 4 || myArray[1].length != 4 || myArray[2].length != 4 || myArray[3].length != 4) {
            String message = "Измените размер. Размер массива должен быть 4*4";
            throw new MyArraySizeException(message);
        }else {
            for (int i = 0; i < myArray.length; i++) {
                row = i + 1;
                for (int j = 0; j < myArray.length; j++) {
                    column = j + 1;
                    try {
                        sum += Integer.parseInt(myArray[i][j]);
                    } catch (NumberFormatException e) {
                        String message = "Неформатный символ в " + row + " строке " + column + " столбце ";
                        throw new MyArrayDataException(message);
                    }
                }
            }
        }

        return sum;
    }
}



