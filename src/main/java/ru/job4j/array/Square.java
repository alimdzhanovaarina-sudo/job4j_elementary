package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        if (bound < 0) {
            throw new IllegalArgumentException("Bound cannot be negative");
        }
        if (bound == 0) {
            return new int[0];
        }

        int[] result = new int[bound];
        for (int index = 0; index < bound; index++) {
            result[index] = index * index;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
