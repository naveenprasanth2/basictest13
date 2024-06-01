package org.example.linkedlist;

import java.util.Arrays;
import java.util.List;

public class LenderBorrower {
    public static void main(String[] args) {
        // Example input
        List<Integer> lend = Arrays.asList(4, 6, 1, 8);
        List<Integer> payback = Arrays.asList(7, 10, 3, 9);
        int size = lend.size();
        int[][] lendPaybacks = new int[size][2];

        for (int i = 0; i < size; i++) {
            lendPaybacks[i][0] = lend.get(i);
            lendPaybacks[i][1] = payback.get(i);
        }
        Arrays.sort(lendPaybacks, (a, b) -> Integer.compare(b[0], a[0]));
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(lendPaybacks[i]));
        }
        int money = 0;
        int days = 0;

        for (int i = 0; i < size; i++) {
            if (money >= lendPaybacks[i][1]) {
                money -= lendPaybacks[i][1];
            }
            days++;
            money += lendPaybacks[i][0];
        }
        System.out.println(days);
    }
}
