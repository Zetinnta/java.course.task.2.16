package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        IntegerList integerList = new IntegerListImpl();
        integerList.add(4);   // 1
        integerList.add(9);   // 2
        integerList.add(13);  // 3
        integerList.add(2);   // 4
        integerList.add(6);   // 5
        integerList.add(17);  // 6
        integerList.add(1);   // 7
        integerList.add(5);   // 8
        integerList.add(22);  // 9
        integerList.add(7);   // 10

        System.out.println(integerList.size());

        integerList.add(12);

        System.out.println(integerList.size());

        System.out.println(Arrays.toString(integerList.toArray()));


    }
}
