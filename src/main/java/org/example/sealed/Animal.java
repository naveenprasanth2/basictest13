package org.example.sealed;

public sealed class Animal permits Cat, Dog, Giraph {
    public void test(){
        System.out.println("animal");
    }
}
