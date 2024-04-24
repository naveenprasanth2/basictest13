package org.example.practise1;

import java.lang.ref.Cleaner.Cleanable;

public class TwoSum implements Cleanable {
    private TwoSum twoSum;

    public static void main(String[] args) {
        int[] a = {3, 2, 4};
        int target = 6;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] == target) {
                System.out.println(STR."The indices are \{i}, \{i + 1}");
                break;
            }
        }
        TwoSum twoSum1 = new TwoSum();
        twoSum1.test();
        twoSum1.clean();
    }

    private void test(){
         twoSum = new TwoSum();
    }

    @Override
    public void clean() {
        twoSum = null;
        System.out.println("cleaned");
    }
}
