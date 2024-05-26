package org.example.challenge;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 0, 0, 0, 0, 0};
        int[] b = {2, 3, 4, 5, 6};

        int aSize = 3;
        int bSize = 4;
        int total = a.length - 1;
        while (aSize >= 0 && bSize >= 0) {
            if (a[aSize] >= b[bSize]) {
                a[total--] = a[aSize--];
            } else {
                a[total--] = b[bSize--];
            }
        }

        while (aSize >= 0) {
            a[total--] = a[aSize--];
        }

        while (bSize >= 0) {
            a[total--] = b[bSize--];
        }

        System.out.println(Arrays.toString(a));
    }
}
