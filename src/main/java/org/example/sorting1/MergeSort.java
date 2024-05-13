package org.example.sorting1;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 4, 3, 5, 6, 33, 4, 5, 5, 6, 6, 777, 7888, 1};
        System.out.println(Arrays.toString(inputArray));
        mergeSort(inputArray);
        System.out.println(Arrays.toString(inputArray));

    }

    private static void mergeSort(int[] inputArray) {
        if (inputArray.length < 2) {
            return;
        }

        int mid = inputArray.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[inputArray.length - mid];

        System.arraycopy(inputArray, 0, leftArray, 0, leftArray.length);
        System.arraycopy(inputArray, mid, rightArray, 0, rightArray.length);
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(inputArray, leftArray, rightArray);
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                inputArray[k++] = leftArray[i++];
            } else {
                inputArray[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            inputArray[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            inputArray[k++] = rightArray[j++];
        }
    }
}
