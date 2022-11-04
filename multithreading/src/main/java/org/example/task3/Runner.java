package org.example.task3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++) {
            exec.execute(new SleepThread());
        }
        exec.shutdown();
    }
}
