package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean isAllTheSame = true;
        boolean standardBulbState = data[0];
        for (int currentBulbIndex = 1; currentBulbIndex < data.length; currentBulbIndex++) {
            boolean currentBulbState = data[currentBulbIndex];
            if (currentBulbState != standardBulbState) {
                isAllTheSame = false;
                break;
            }
        }
        return isAllTheSame;
    }
}
