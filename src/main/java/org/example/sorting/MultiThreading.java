package org.example.sorting;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("test");
        };
        Runnable runnable1 = () -> System.out.println("test");
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
        thread1.join();
        System.out.println("program completed");
    }
}
