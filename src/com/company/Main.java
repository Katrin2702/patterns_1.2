package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int size;
        int maxValue;
        int f;
        List<Integer> listNumber = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Logger logger = Logger.getInstance();

        logger.log("Запуск программы");
        logger.log("Просим пользователя ввести данные для списка");
        System.out.println("Введите, пожалуста, данные для автоматического создания списка чисел");
        System.out.println("Введите размер списка:");
        size = scan.nextInt();

        System.out.println("Введите верхнюю границу для значений:");
        maxValue = scan.nextInt();

        logger.log("Создаем список");
        for (int i = 0; i < size; i++) {
            listNumber.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список:");
        for (Integer str : listNumber) System.out.print(str + " ");
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите число для фильтрации списка:");
        f = scan.nextInt();
        Filter filter = new Filter(f);

        logger.log("Запускаем фильтрацию");

        List<Integer> result = filter.filterOut(listNumber);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список");
        for (Integer str : result) System.out.print(str + " ");
        System.out.println();

        logger.log("Завершаем программу");
    }
}
