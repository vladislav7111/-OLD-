package lesson2.hometask2.carTest;

import java.util.*;
import lesson2.hometask2.Car;

public class CarMapTest implements Testable {

    private Car[] array = {new Car(1, "Toyota", 1500, 220),
            new Car(22, "Moskvich", 2000, 499),
            new Car(222, "Moskvich", 2000, 499),
            new Car(4, "BMW", 1450, 210)};

    private Map<String, Car> map = new HashMap<String, Car>();

    @Override
    public void test() {
        putValueToMap(array);
        printMapEntries(map);
    }

    private void putValueToMap(Car[] array) {
        for(Car item: array) {
            map.put(item.getName(),item);
        }
    }

    private void printMapEntries(Map<String, Car> map) {
        for(Map.Entry<String, Car> entry: map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("Array length: " + array.length);
        System.out.println("Map size: " + map.size());
    }
}
