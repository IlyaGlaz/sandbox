package org.example.task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            ex.execute(new SimpleRunnable());
        }
        ex.shutdown();
    }
}
