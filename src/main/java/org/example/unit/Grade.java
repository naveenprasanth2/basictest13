package org.example.unit;

public class Grade {
    public char determineGrade(int numberGrade) {
        if (numberGrade < 0 || numberGrade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
