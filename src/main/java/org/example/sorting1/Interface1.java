package org.example.sorting1;

public interface Interface1 {
    private void test() {
        System.out.println("testing only");
    }

    default void summa() {
        test();
    }

    static void testing(){
        System.out.println("static");
    }
}
