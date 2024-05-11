package org.example.practise3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {55, 1, 2, 3, 2, 1, 4, 5, 6, 7, 54, 0};
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
