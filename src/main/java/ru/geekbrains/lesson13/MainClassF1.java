package ru.geekbrains.lesson13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class MainClassF1 {

        public static final int CARS_COUNT = 4;
        public static final int HALF_CARS_COUNT = CARS_COUNT / 2;
        public static void main(String[] args) {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
            CyclicBarrier cb = new CyclicBarrier(CARS_COUNT + 1,
                    () -> System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!"));
            CountDownLatch cdl = new CountDownLatch(CARS_COUNT);
            Race race = new Race(new Road(60), new Tunnel(), new Road(40));
            Car[] cars = new Car[CARS_COUNT];
            for (int i = 0; i < cars.length; i++) {
                cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb, cdl);
            }
            for (Car car : cars) {
                new Thread(car).start();
            }
            try {
                cb.await();
            } catch (InterruptedException | BrokenBarrierException ex) {
                ex.printStackTrace();
            }

            try {
                cdl.await();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
            }
        }
    }


