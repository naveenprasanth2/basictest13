package org.example.unit;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
 class MethodsOrderedByName {

    @Test
    void testA(){
        System.out.println("Running Test A");
    }

    @Test
    void testB(){
        System.out.println("Running Test B");
    }
    @Test
    void testC(){
        System.out.println("Running Test C");
    }
    @Test
    void testD(){
        System.out.println("Running Test D");
    }

    @Test
    void testE(){
        System.out.println("Running Test E");
    }
}
