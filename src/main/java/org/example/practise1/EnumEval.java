package org.example.practise1;

import java.util.Arrays;

public class EnumEval {
    public static void main(String[] args) {
        DaysOfWeek[] daysOfWeek = DaysOfWeek.values();
        System.out.println(Arrays.toString(daysOfWeek));

        Cereals[] cereals = Cereals.values();
        for (Cereals cereal : cereals) {
            System.out.println(cereal.levelOfDeliciousNess);
        }
    }
}
