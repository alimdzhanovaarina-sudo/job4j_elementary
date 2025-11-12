package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 187; // Переименовали для ясности
        double man = Fit.manWeight(manHeight);
        System.out.println("Man " + manHeight + " cm is " + man + " kg");

        short womanHeight = 170; // Переименовали для ясности
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Woman " + womanHeight + " cm is " + woman + " kg");
    }
}

