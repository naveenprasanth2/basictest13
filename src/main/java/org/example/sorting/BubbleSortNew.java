package org.example.sorting;

import java.util.Arrays;

public class BubbleSortNew {
    public static void main(String[] args) {
        int[] a = {4, 3, 2, 4, 5, 6, 3, 1};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
