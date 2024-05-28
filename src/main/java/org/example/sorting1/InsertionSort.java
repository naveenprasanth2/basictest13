package org.example.sorting1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArray = {888, 89, 67, 878, 5373, 8989, 1, 2, 4, 3, 5, 6, 33, 4, 5, 5, 6, 6, 777, 7888, 1, 0};
        System.out.println(Arrays.toString(inputArray));
        insertionSort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];
            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j+1] = currentValue;
        }
    }
}
