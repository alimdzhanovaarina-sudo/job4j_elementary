package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return false;
        }
        int lastElementLeft = left[left.length - 1];
        int lastElementRight = right[right.length - 1];
        return lastElementLeft == lastElementRight;
    }
}
