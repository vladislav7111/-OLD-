package lesson1.hometask1;

import java.util.Scanner;

class Massive {

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