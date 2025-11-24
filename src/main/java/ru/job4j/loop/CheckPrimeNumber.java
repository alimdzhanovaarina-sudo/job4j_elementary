package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        System.out.println("2 is prime: " + check(2));
        System.out.println("3 is prime: " + check(3));
        System.out.println("4 is prime: " + check(4));
        System.out.println("5 is prime: " + check(5));
        System.out.println("1 is prime: " + check(1));
        System.out.println("0 is prime: " + check(0));
    }
}

