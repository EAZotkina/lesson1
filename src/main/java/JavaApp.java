public class JavaApp {
// Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        System.out.println(calculate(2, 2, 2, 2));
        System.out.println(task10and20(5, 6));
        isPositiveOrNegative(-30);
        isNegative(-30);
        greetings( "Лена");
        checkYear(4400);







        //Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte a = -111;
        short b = 31555;
        int c = 1000;
        long d = 2000000L;
        float e = 12.23f;
        double f = -123.123;
        char g = '*';
        char h = '\u2242';
        boolean i = false;
        String s1 = "Hello";

    }
// Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float calculate(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }
    //Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.


    public static boolean task10and20(int x1, int x2) {
   int sum = x1 + x2;
   if ( sum < 20 && sum > 10 ) {
       return true;
          } else {
       return false;
       }
    }

//Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

    public static void isPositiveOrNegative(int x) {
        if( x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
//Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false,
// если положительное.

    public static boolean isNegative(int x) {
        if(x < 0) {
            return true;
        }
        return false;
    }


//Написать метод, которому в качестве параметра передается строка,
// обозначающая имя. Метод должен вывести в консоль сообщение
// «Привет, указанное_имя!».

    public static void greetings(String name) {
        System.out.println("Привет, " + name + " !");
    }
//*Написать метод, который определяет, является ли год високосным,
// и выводит сообщение в консоль. Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високоосный");
        }
    }


}






