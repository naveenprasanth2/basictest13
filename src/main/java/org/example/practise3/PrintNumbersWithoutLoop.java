package org.example.practise3;

import java.util.Arrays;

public class PrintNumbersWithoutLoop {
    public static void main(String[] args) {
        Object[] array = new Object[100];
        Arrays.fill(array, new Object(){
            int count = 1;
            @Override
            public String toString() {
                return String.valueOf(count++);
            }
        });

        System.out.println(Arrays.toString(array));
    }
}
