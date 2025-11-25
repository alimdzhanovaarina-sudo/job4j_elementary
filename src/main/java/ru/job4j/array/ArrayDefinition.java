package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[5];
        names[0] = "Katya";
        names[1] = "Danya";
        names[2] = "Rina";
        names[3] = "Oleg";
        names[4] = "Sergei";
        System.out.println("Элементы массива names: " + Arrays.toString(names));
    }
}
