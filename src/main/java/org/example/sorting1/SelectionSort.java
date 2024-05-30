package org.example.sorting1;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] inputArray = {888, 89, 67, 878, 5373, 8989, 1, 2, 4, 3, 5, 6, 33, 4, 5, 5, 6, 6, 777, 7888, 1, 0};
        System.out.println(Arrays.toString(inputArray));
        selectionSort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    private static void selectionSort(int[] inputArray) {
        int length = inputArray.length;

        for (int i = 0; i < length - 1; i++) {
            int min = inputArray[i];
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (min > inputArray[j]) {
                    min = inputArray[j];
                    minIndex = j;
                }
            }
            inputArray[minIndex] = inputArray[i];
            inputArray[i] = min;
        }

    }
}
