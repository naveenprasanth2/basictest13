package org.example.interview;

import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String test = "My90name10is50Naveen";
        int finalVal = 0;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < test.toCharArray().length; i++) {
            if (Pattern.matches("[0-9]", String.valueOf(test.charAt(i)))) {
                temp.append(test.charAt(i));
            } else {
                if (!temp.isEmpty())
                    finalVal += Integer.parseInt(temp.toString());
                temp.delete(0, temp.length());
            }
        }

        System.out.println(finalVal);
    }
}
