package org.example.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {
    @Test
    void checkGrade(){
        Grade grade = new Grade();
        System.out.println(grade.determineGrade(1));
    }

}