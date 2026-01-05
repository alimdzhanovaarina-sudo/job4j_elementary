package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String translation = "Неизвестное слово. " + eng;
        return translation;
    }

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String result = dictionary.engToRus("cat");
        System.out.println("Результат словаря: " + result);
    }
}

