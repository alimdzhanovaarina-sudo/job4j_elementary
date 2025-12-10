package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        return swap(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

