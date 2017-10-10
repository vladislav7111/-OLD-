package lesson1.hometask1;

import java.util.Scanner;



 class Massive {

   static int[] array;


    static void createMassive() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длинну массива(меньше 10): ");
        int size = input.nextInt();
        while (size>=10){
            System.out.println("Введите корректную длинну массива.");
            size = input.nextInt();
        }
        array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); }
        System.out.print ("Введённый массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }System.out.println();
    }

    static void maxValueInMassive(int mas[]) {
        int maximum = mas[0];
        System.out.print("Максимальное значение: ");
        for (int i = 0; i < mas.length; i++)
            if (maximum < mas[i]) maximum = mas[i];
        System.out.println(maximum);
    }

    static void minValueInMassive(int mas[]) {
        int minimum = mas[0];
        System.out.print("Минимальное значение: ");
        for (int i = 0; i < mas.length; i++)
            if (mas[i] < mas[0]) minimum = mas[i];
        System.out.println(minimum);
    }

    static void kolElementov(int mas[]) {
        int a=mas.length;
        System.out.println("Колическтво элементов массива:" + a);
    }

    static void summaElementov(int mas[]) {
        int sum=0;
        for(int i=0; i<mas.length; i++) {
            sum=sum+mas[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
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
        }
    }

    ////////////////////СОРТИРОВКА///////////////////////


    static void obVivod(int[] mas) {
        System.out.print("Ваш массив: ");
        for (int v : mas)
            System.out.print(v + " ");
    }

    static void obrVivod(int[] mas) {
        System.out.print("Массив в обратном порядке: ");
        for (int i=mas.length-1; i>=0; i--){
            System.out.print(mas[i] + " ");
        }
    }

    static void sortirovkaMassiva(int[] mas) {
        boolean changes;
        do {
            changes = false;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    int current1 = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = current1;
                    changes = true;
                }
            }
        }
        while (changes);
        for (int v : mas)
            System.out.print(v + " ");
    }

    static void zamenaElementaMassiva(int[] mas) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер элемента для замены:");
        int size = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите на какое значение вы хотите поменять: ");
        int size1 = input1.nextInt();
        mas [size] = size1;
        for (int v : mas)
            System.out.print(v + " ");
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
    }

}



