package org.example.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSortNew {
    public static void main(String[] args) {
        int[] a = new int[10000000];
        Random random = new Random();
        for (int i = 0; i<a.length; i++){
            a[i] = random.nextInt(10000000);
        }
//        System.out.println(Arrays.toString(a));
        System.out.println("Before");
        mergeSort(a);
//        System.out.println(Arrays.toString(a));
        System.out.println("After");
    }


    private static void mergeSort(int[] inputArray) {
        if (inputArray.length < 2) {
            return;
        }

        int mid = inputArray.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[inputArray.length - mid];

        System.arraycopy(inputArray, 0, leftArray, 0, mid);

        System.arraycopy(inputArray, mid, rightArray, 0, rightArray.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(inputArray, leftArray, rightArray);
    }


    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length){
            if (leftArray[i] <= rightArray[j]){
                inputArray[k++] =  leftArray[i++];
            }else {
                inputArray[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length){
            inputArray[k++] =  leftArray[i++];
        }

        while (j < rightArray.length){
            inputArray[k++] =  rightArray[j++];
        }
    }
}
