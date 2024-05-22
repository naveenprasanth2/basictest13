package org.example.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {1, 2};
        int[] mergedArray = new int[nums1.length + nums2.length];
        List<Integer> test = new ArrayList<>();
        for (int num: nums1){
            addElement(num, test);
        }
        for (int num: nums2){
            addElement(num, test);
        }
       for (int i =0; i<test.size(); i++){
           mergedArray[i] = test.get(i);
       }
       int median = (mergedArray.length + 1) /2;
        System.out.println(mergedArray[median]);
    }

    private static void addElement(int value, List<Integer> test){
        int index = Collections.binarySearch(test, value);
        if (index<0){
            index = -index-1;
        }
        test.add(index, value);
    }
}
