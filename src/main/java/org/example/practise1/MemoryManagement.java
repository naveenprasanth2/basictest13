package org.example.practise1;

public class MemoryManagement {

    private int a = 7, b = 5;

    public static void main() {
        MemoryManagement memoryManagement = new MemoryManagement();
        memoryManagement.a = memoryManagement.b = 22;
        System.out.println(memoryManagement.a);
        System.out.println(memoryManagement.b);
    }
}