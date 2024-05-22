package org.example.challenge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] unsorted = {1, 2, 3, 2, 3, 4, 5, 6, 5, 4, 3, 2, 7, 8, 9, 0};
        mergeSort(unsorted);
        System.out.println(Arrays.toString(unsorted));
    }

    private static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int middle = array.length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        System.arraycopy(array, 0, leftArray, 0, leftArray.length);

        System.arraycopy(array, middle, rightArray, 0, array.length - middle);
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
    }


    private static void merge(int[] original, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                original[k++] = left[i++];
            } else {
                original[k++] = right[j++];
            }
        }

        while (i < left.length) {
            original[k++] = left[i++];
        }

        while (j < right.length) {
            original[k++] = right[j++];
        }
    }
}
