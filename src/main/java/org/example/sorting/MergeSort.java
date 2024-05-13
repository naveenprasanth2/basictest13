package org.example.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {55, 1, 2, 3, 2, 4, 5, 3, 4, 7, 8, 6, 7, 3, 2, 1};
        System.out.println(Arrays.toString(a));
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] inputArray) {
        if (inputArray.length < 2) {
            return;
        }
        int mid = inputArray.length/2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[inputArray.length - mid];

        for (int i = 0; i<mid; i++){
            leftArray[i] = inputArray[i];
        }

        for (int i = mid; i<inputArray.length; i++){
            rightArray[i-mid] = inputArray[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(inputArray, leftArray, rightArray);
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int i =0, j = 0,  k = 0;

        while (i < leftArray.length && j < rightArray.length){
            if (leftArray[i] <= rightArray[j]){
                inputArray[k++] = leftArray[i++];
            }else {
                inputArray[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length){
            inputArray[k++] = leftArray[i++];
        }

        while (j < rightArray.length){
            inputArray[k++] = rightArray[j++];
        }
    }
}
