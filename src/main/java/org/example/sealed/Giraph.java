package org.example.sealed;

public sealed class Giraph extends Animal permits TestClass {

    public static void main(String[] args) {
        Animal animal = new Giraph();
        animal.test();
    }
}
