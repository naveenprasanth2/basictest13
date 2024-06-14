package org.example.threads;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Runnable runnable = () -> System.out.println(STR."Thread name is \{Thread.currentThread().getName()}");

        for (int i = 0; i < 100; i++) {
            executorService.execute(runnable);
        }
    }
}
