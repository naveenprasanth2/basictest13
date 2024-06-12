package org.example.challenge;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 0, 0, 0, 0, 0, 0};
        int[] b = {2, 3, 4, 5, 6, 7};

        int aSize = 2;
        int bSize = 4;

        int length = a.length - 1;

        while (aSize >= 0 && bSize >= 0){
            if(a[aSize] < b[bSize]){
                a[length--] = b[bSize--];
            }else {
                a[length--] = a[aSize--];
            }
        }



        System.out.println(Arrays.toString(a));
    }
}
