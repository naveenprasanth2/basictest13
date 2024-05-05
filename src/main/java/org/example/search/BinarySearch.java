package org.example.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int elementToFind = 5;
        int startIndex = 0;
        int endIndex = a.length - 1;
        int elementIndex = -1;
        int condition = (startIndex + (endIndex / 2));
        while (condition != a.length - 1) {
            if (a[condition] == elementToFind) {
                elementIndex = condition;
            } else if (a[condition] > elementToFind) {
                startIndex = condition;
            } else {
                endIndex = condition;
            }
            condition = (startIndex + (endIndex / 2));
        }
        System.out.println(elementIndex);
    }
}
