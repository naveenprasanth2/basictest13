package org.example.sorting1;

import java.util.Comparator;

public class Compare implements Comparable<Compare>{
    int age;
    Comparator<Compare> comparator = Comparator.comparingInt(value -> value.age);
    @Override
    public int compareTo(Compare o) {
        return Integer.compare(this.age, o.age);
    }
}
