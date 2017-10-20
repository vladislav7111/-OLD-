package lesson1.hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



 class Massive {

   static int[] array;


     void createMassive() throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите длинну массива(меньше 10): ");
            int size = Integer.parseInt(input.readLine());

            while (size>=10){
                System.out.println("Введите корректную длинну массива.");
                size = Integer.parseInt(input.readLine());
            }
            array = new int[size];
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < size; i++) {

                array[i] = Integer.parseInt(input.readLine());
            }
            System.out.print ("Введённый массив: ");
            for (int i = 0; i < size; i++) {
                System.out.print (" " + array[i]);
            }System.out.println();
        }
        catch (NumberFormatException e) {
            System.out.println("Введите числовые значения.");
            createMassive();
        }

    }

    static void maxValueInMassive(int mas[]) {
        int maximum = mas[0];
        System.out.print("Максимальное значение: ");
        for (int i = 0; i < mas.length; i++)
            if (maximum < mas[i]) maximum = mas[i];
        System.out.println(maximum);
        MenuOptions.soutOperations2level();

    }

    static void minValueInMassive(int mas[]) {
        int minimum = mas[0];
        System.out.print("Минимальное значение: ");
        for (int i = 0; i < mas.length; i++)
            if (mas[i] < mas[0]) minimum = mas[i];
        System.out.println(minimum);
        MenuOptions.soutOperations2level();
    }

    static void kolElementov(int mas[]) {
        int a=mas.length;
        System.out.println("Колическтво элементов массива:" + a);
        MenuOptions.soutOperations2level();
    }

    static void summaElementov(int mas[]) {
        int sum=0;
        for(int i=0; i<mas.length; i++) {
            sum=sum+mas[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
        MenuOptions.soutOperations2level();
    }

    static void averageValue(int mas[]) {
        double average = 0;
        if (mas.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < mas.length; j++) {
                sum += mas[j];
            }
            average = sum / mas.length;
            System.out.println("Среднее значение всех элементов массива: " + average);
            MenuOptions.soutOperations2level();
        }
    }

    static void obVivod(int[] mas) {
        System.out.print("Ваш массив: ");
        for (int i = 0; i<mas.length; i++)
            System.out.print( mas[i] + " ");
        MenuOptions.soutOperations2levelPrint();
    }

    static void obrVivod(int[] mas) {
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

    static void zamenaElementaMassiva(int[] mas) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер элемента для замены:");
        int size = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите на какое значение вы хотите поменять: ");
        int size1 = input1.nextInt();
        mas [size-1] = size1;
        for (int v : mas)
            System.out.print(v + " ");
        MenuOptions.soutOperations2levelSeach();
    }

    static void elementVMasive(int[] mas) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите элемент для проверки:");
        int element = input.nextInt();
        boolean count=false;
        for (int i = 0; i < mas.length; i++) {
            if (element == mas[i]) {count = true; break; }
        }
        if (count){System.out.println("Данный элемент есть в массиве.");}
        else System.out.println("Данного элемента нет в массиве.");
        MenuOptions.soutOperations2levelSeach();
    }

}



