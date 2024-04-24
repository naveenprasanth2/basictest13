package org.example.practise1;

import lombok.Getter;

@Getter
class Counter {
    private int count;

    void incrementCount() {
        synchronized (Counter.class) {
            count++;
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementCount();
            }
        };

        Runnable runnable1 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementCount();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }

}
