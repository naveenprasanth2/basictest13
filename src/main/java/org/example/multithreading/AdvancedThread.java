package org.example.multithreading;

public class AdvancedThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hi");
            }
        }, "Hi Thread");

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello");
            }
        }, "Hello Thread");


        t1.start();
        System.out.println(t1.isAlive());
        System.out.println(t1.getName());
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        t2.start();
        t1.join();
        System.out.println(t1.isAlive());
        t2.join();
        System.out.println("Bye");
    }
}
