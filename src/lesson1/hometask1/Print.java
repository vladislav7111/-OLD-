package lesson1.hometask1;

import static lesson1.hometask1.MassiveGenerator.array;

public class Print {
    static void normalOutput(int[] mas) {
        System.out.print("Ваш массив: ");
        for (int i = 0; i<mas.length; i++)
            System.out.print( mas[i] + " ");
        MenuOptions.soutOperations2levelPrint();
    }

    static void reversOutput(int[] mas) {
        System.out.print("Массив в обратном порядке: ");
        for (int i = mas.length - 1; i >= 0; i--)
            System.out.print( mas[i] + " ");
        MenuOptions.soutOperations2levelPrint();
    }

    static void sortirovkaMassiva(int[] mas) {
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int t = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = t;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i<array.length; i++)
            System.out.print(array[i]+ " ");
        MenuOptions.soutOperations2levelPrint();
    }
}
