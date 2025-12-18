package ru.job4j.ru.job4j;

public class Mono {

    public static boolean isMono(int[] nums) {
        for (int i = 0; 1 < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1] || nums[i] <= nums[i + 1]) {
                return true;
            }
        }
            return false;
    }

    public static boolean isAsc(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(nums[i]);
        }
    }
}

