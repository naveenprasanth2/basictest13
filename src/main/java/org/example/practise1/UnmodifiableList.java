package org.example.practise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args) {
        int[] a = {1,2,3,};
        List<Integer> integerList = new ArrayList<>(Arrays.stream(a).boxed().toList());
        System.out.println(integerList);
        List<Integer> integerList1 = Collections.unmodifiableList(integerList);
//        List<Integer> integerList2 = List.of(integerList); not possible, onl
    }
}
