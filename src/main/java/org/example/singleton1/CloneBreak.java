package org.example.singleton1;

public class CloneBreak {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton singleton  = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        Singleton singleton1 = (Singleton) singleton.clone();
        System.out.println(singleton1.hashCode());
    }
}
