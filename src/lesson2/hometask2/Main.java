package lesson2.hometask2;

import lesson2.hometask2.carTest.*;

public class Main {

    public static void main(String[] args) {
        Testable listTestable = new CarListTest();
        Testable setTestable = new CarSetTest();
        Testable mapTestable = new CarMapTest();

        result(listTestable,"-----List-----");
        result(setTestable,"-----Set-----");
        result(mapTestable,"-----HashMap-----");
    }
    public static void result(Testable testable, String kindOfCollections) {
        System.out.println(kindOfCollections);
        testable.test();
    }
}
