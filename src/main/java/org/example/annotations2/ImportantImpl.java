package org.example.annotations2;

public class ImportantImpl {
    @ImportantString(times = 4)
    public void test() {
        System.out.println("Test method");
    }

    @ImportantString(times = 5)
    public static void staticMethod() {
        System.out.println("Static Test method");
    }
}
