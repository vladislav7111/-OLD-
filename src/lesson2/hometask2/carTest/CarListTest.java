package lesson2.hometask2.carTest;

import java.util.*;
import lesson2.hometask2.Car;

public class CarListTest implements Testable {

    private Car[] array = {new Car(1, "Toyota", 1500, 220),
            new Car(22, "Moskvich", 2000, 499),
            new Car(22, "Moskvich", 2000, 499),
            new Car(4, "BMW", 1450, 210)};


    private List list = new ArrayList();

    @Override
    public void test() {
        addValuesToList(array);
        printListEntries(list);
    }

    private void addValuesToList(Car[] array) {
        for(int index = 0; index < array.length; index++) {
            list.add(array[index]);
        }
    }

    private void printListEntries(List list) {
        for(int index = 0; index < list.size(); index++) {
            System.out.println("Element "+index+": " + list.get(index));
        }
        System.out.println("Array length: " + array.length);
        System.out.println("List size: " + list.size());
    }

}
