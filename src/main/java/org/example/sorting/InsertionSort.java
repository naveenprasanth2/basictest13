package org.example.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {4, 3, 2, 4, 5, 6, 3, 1};

        for (int i = 0; i < a.length; i++) {
            int smallest = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }


        System.out.println(Arrays.toString(a));
    }
}
