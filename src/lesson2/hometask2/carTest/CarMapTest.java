package lesson2.hometask2.carTest;

import java.util.*;
import lesson2.hometask2.Car;

public class CarMapTest implements Testable {

    private Car[] array = {new Car(1, "Toyota", 1500, 220),
            new Car(22, "Moskvich", 2000, 499),
            new Car(222, "Moskvich", 2000, 499),
            new Car(4, "BMW", 1450, 210)};

    private Map<String, Integer> map = new HashMap<String, Integer>();

    @Override
    public void test() {
        putValueToMap(array);
        printMapEntries(map);
    }

    private void putValueToMap(Car[] array) {
        for(Car item: array) {
            map.put(item.getName(), new Random().nextInt(10) + 1);
        }
    }

    private void printMapEntries(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", number: " + entry.getValue());
        }
        System.out.println("Array length: " + array.length);
        System.out.println("Map size: " + map.size());
    }
}
