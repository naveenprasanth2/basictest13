package org.example.sorting1;

import java.lang.ref.Cleaner;

public class InterfaceTest implements Interface1, Cleaner.Cleanable {
    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTest();
        interfaceTest.summa();
        Interface1.testing();
        interfaceTest.clean();
    }

    @Override
    public void clean() {
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println("test");
    }
}
