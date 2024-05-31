package org.example.linkedlist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Overlap {
    public static void main(String[] args) {
        List<Integer> scheduleStart = Arrays.asList(1, 1, 2);
        List<Integer> scheduleEnd = Arrays.asList(3, 2, 4);
        int size = scheduleStart.size();
        int[][] events = new int[size][2];

        for (int i = 0; i < size; i++){
            events[i][0] = scheduleStart.get(i);
            events[i][1] = scheduleEnd.get(i);
        }

        Arrays.sort(events, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int lastEndTime = 0;

        for (int i = 0; i < size; i++){
            if(events[i][0] >= lastEndTime){
                count++;
                lastEndTime = events[i][1];
            }
        }
        System.out.println(count);
    }
}
