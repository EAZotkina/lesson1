package ru.geekbrains.lesson7;

public class MainApp {
    public static void main(String[] args) {

        Cats[] cat = new Cats[5];
        cat[0] = new Cats("Барсик", 70, false);
        cat[1] = new Cats("Мурзик", 30, false);
        cat[2] = new Cats("Пиксель", 100, false);
        cat[3] = new Cats("Леопольд", 50, false);
        cat[4] = new Cats("Котопёс", 10, false);
        Plates plate = new Plates(70);
        plate.addFood(100);
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            if (cat[i].getAppetite() <= plate.getFood()) {
                cat[i].eat(plate);
                cat[i].isFull();
                cat[i].catInfo();
            } else {
                cat[i].catInfo();
            }
        }
        plate.info();
    }
}





//
//Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
