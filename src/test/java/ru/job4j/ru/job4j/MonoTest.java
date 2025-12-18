package ru.job4j.ru.job4j;

import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.ru.job4j.Mono.isMono;

class MonoTest {
    public static void testIsMono() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        int[] arr3 = {3, 1, 3};
        System.out.println("isMono([1, 2, 3]): " + isMono(arr1));
        System.out.println("isMono([3, 2, 1]): " + isMono(arr2));
        System.out.println("isMono([3, 1, 3]): " + isMono(arr3));
    }
}