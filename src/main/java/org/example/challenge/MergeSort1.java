package org.example.challenge;

import java.util.Arrays;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] unsorted = {1, 2, 3, 2, 3, 4, 5, 6, 5, 4, 3, 2, 7, 8, 9, 0};
        System.out.println(Arrays.toString(unsorted));
        mergeSort(unsorted);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(unsorted));
    }

    private static void mergeSort(int[] array) {
        if (array.length == 1) return;

        int mid = array.length / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        System.arraycopy(array, 0, leftArray, 0, leftArray.length);
        System.arraycopy(array, mid, rightArray, 0, rightArray.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length || j < rightArray.length) {
            if (i < leftArray.length && (j >= rightArray.length || leftArray[i] < rightArray[j])) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
    }
}
