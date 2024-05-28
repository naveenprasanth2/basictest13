package org.example.sorting1;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] inputArray = {190, 1, 2, 2, 1, 32, 4, 5, 6, 4, 5, 5, 6, 55, 99, 8, 7, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(inputArray));
        mergeSort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }


    private static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
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

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
}
