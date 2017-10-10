package lesson1.hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static lesson1.hometask1.Massive.array;


 class Menu {


    static void createMenu() throws IOException {
        BufferedReader k = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("\n" +
                "Выберите действие?\n" +
                "1 - Операции\n" +
                "2 - Печать\n" +
                "3 - Выход");
        boolean quit = false;
        int menuItem;
        do {
            System.out.print("Выберите необходимую операцию: ");
            menuItem = Integer.parseInt(k.readLine());
            switch (menuItem) {
                case 1:
                    System.out.println("Вы выбрали Операции:");
                    createMenu2Level();
                    break;
                case 2:
                    System.out.println("Вы выбрали Печать:");
                    createMenu2LevelPrint();

                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Неправильный выбор!");
            }
        } while (!quit);
        System.out.println("Досвидания...");
    }


    static void createMenu2Level() throws IOException {
        BufferedReader m = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("\n" +
                "Выберите действие?\n" +
                "1 - Вычисление значений\n" +
                "2 - Поиск\n" +
                "3 - Назад");
        boolean quit = false;
        int menuItem2Level;
        do {
            System.out.print("Выберите необходимое действие: ");
            menuItem2Level = Integer.parseInt(m.readLine());
            switch (menuItem2Level) {
                case 1:
                    System.out.println("Case 1");
                    createMenu2Level2();
                    break;
                case 2:
                    createMenu2Level2Seach();
                    break;
                case 3:
                    System.out.println("\n" +
                            "Выберите действие?\n" +
                            "1 - Операции\n" +
                            "2 - Печать\n" +
                            "3 - Выход");
                    quit = true;
                    break;
                default:
                    System.out.println("Неправильный выбор!");
            }
        } while (!quit);

    }

    static void createMenu2LevelPrint() throws IOException {
        BufferedReader p = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("\n" +
                "Выберите действие?\n" +
                "1 - Печать массива в прямом порядке\n" +
                "2 - Печать массива в обратном порядке\n" +
                "3 - Печать массива в отсортированном порядке\n" +
                "4 - Назад");
        boolean quit = false;
        int menuItem2LevelPrint;
        do {
            System.out.print("Выберите необходимое действие: ");
            menuItem2LevelPrint = Integer.parseInt(p.readLine());
            switch (menuItem2LevelPrint) {
                case 1:
                    Massive.obVivod(array);
                    break;
                case 2:
                    Massive.obrVivod(array);
                    break;
                case 3:
                    Massive.sortirovkaMassiva(array);
                    break;
                case 4:
                    System.out.println("\n" +
                            "Выберите действие?\n" +
                            "1 - Операции\n" +
                            "2 - Печать\n" +
                            "3 - Выход");
                    quit = true;
                    break;
                default:
                    System.out.println("Неправильный выбор!");
            }
        } while (!quit);

    }

    static void createMenu2Level2Seach() throws IOException {
        BufferedReader q = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("\n" +
                "Выберите действие?\n" +
                "1 - Входит ли элемент в массив?\n" +
                "2 - Замена элемента массива\n" +
                "3 - Назад");
        boolean quit = false;
        int menuItem2LevelSeach;
        do {
            System.out.print("Выберите необходимое действие: ");
            menuItem2LevelSeach = Integer.parseInt(q.readLine());
            switch (menuItem2LevelSeach) {
                case 1:
                    Massive.elementVMasive(array);

                    break;
                case 2:
                    Massive.zamenaElementaMassiva(array);
                    break;
                case 3:
                    System.out.println("\n" +
                            "Выберите действие?\n" +
                            "1 - Вычисление значений\n" +
                            "2 - Поиск\n" +
                            "3 - Назад");
                    quit = true;
                    break;
                default:
                    System.out.println("Неправильный выбор!");
            }
        } while (!quit);

    }

    static void createMenu2Level2() throws IOException {
        BufferedReader g = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("\n" +
                "Выберите действие?\n" +
                "1 - Найти максимум\n" +
                "2 - Найти минимум\n" +
                "3 - Нийти количество\n" +
                "4 - Найти сумму значений\n" +
                "5 - Найти среднее значение\n" +
                "6 - Назад ");
        boolean quit = false;
        int menuItem3Level;
        do {
            System.out.print("Выберите необходимое действие: ");
            menuItem3Level = Integer.parseInt(g.readLine());
            switch (menuItem3Level) {
                case 1:
                    lesson1.hometask1.Massive.maxValueInMassive(array);
                    break;
                case 2:
                    Massive.minValueInMassive(array);
                    break;
                case 3:
                    Massive.kolElementov(array);
                    break;
                case 4:
                    Massive.summaElementov(array);
                    break;
                case 5:
                    Massive.averageValue(array);
                    break;
                case 6:
                    System.out.println("\n" +
                            "Выберите действие?\n" +
                            "1 - Вычисление значений\n" +
                            "2 - Поиск\n" +
                            "3 - Назад");
                    quit = true;
                    break;
                default:
                    System.out.println("Неправильный выбор!");
            }
        } while (!quit);

    }
}