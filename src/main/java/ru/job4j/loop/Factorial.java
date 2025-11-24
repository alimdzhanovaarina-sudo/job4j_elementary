package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int index = 1; index <= number; index++)
            result = result * index;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Факториал 2: " + calculate(2));
        System.out.println("Факториал 3: " + calculate(3));
        System.out.println("Факториал 4: " + calculate(4));
        System.out.println("Факториал 5: " + calculate(5));
    }
}
