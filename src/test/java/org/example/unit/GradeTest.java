package org.example.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {
    @Test
    void fiftyNineShouldReturnF() {
        Grade grade = new Grade();
        assertEquals('F', grade.determineGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        Grade grade = new Grade();
        assertEquals('D', grade.determineGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        Grade grade = new Grade();
        assertEquals('C', grade.determineGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        Grade grade = new Grade();
        assertEquals('B', grade.determineGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA() {
        Grade grade = new Grade();
        assertEquals('A', grade.determineGrade(99));
    }

    @Test
    void oneHundredOneShouldThrowIllegalArgumentException() {
        Grade grade = new Grade();
        assertThrows(IllegalArgumentException.class, () -> grade.determineGrade(101));
    }

    @Test
    void lessThanZeroShouldThrowIllegalArgumentException() {
        Grade grade = new Grade();
        assertThrows(IllegalArgumentException.class, () -> grade.determineGrade(-1));
    }

}