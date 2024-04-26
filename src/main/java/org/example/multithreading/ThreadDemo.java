package org.example.multithreading;

class Hi implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hi");
        }
    }
}

class Hello implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");
        }
    }
}


public class ThreadDemo {

    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}
