package lesson2.hometask2.carTest;

import java.util.*;
import lesson2.hometask2.Car;

public class CarSetTest implements Testable {
    private Car[] array = {new Car(1, "Toyota", 1500, 220),
            new Car(22, "Moskvich", 2000, 499),
            new Car(22, "Moskvich", 2000, 499),
            new Car(4, "BMW", 1450, 210)};

    private Set<Car> set = new HashSet();

    @Override
    public void test() {
        addValuesToSet(array);
        printSetEntries(set);
    }

    private void addValuesToSet(Car[] array) {
        set.addAll(Arrays.asList(array));
    }

    private void printSetEntries(Set<Car> set) {
        for(Car entry: set) {
            System.out.println("Element: " + entry.toString());
        }
        System.out.println("Array length: " + array.length);
        System.out.println("Set size: " + set.size());
    }


}
