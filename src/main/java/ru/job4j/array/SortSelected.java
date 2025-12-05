package ru.job4j.array;

import ru.job4j.array.MinDiapason;
import ru.job4j.array.FindLoop;
import ru.job4j.array.SwitchArray;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int start = i;
            int finish = data.length - 1;
            int min = MinDiapason.findMin(data, start, finish);
            int indexMin = FindLoop.indexInRange(data, min, start, finish);
            SwitchArray.swap(data, i, indexMin);
        }
        return data;
    }
}
