package org.example.task3;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SleepThread implements Runnable {

    @Override
    public void run() {
        int timeout = (new Random().nextInt(10) + 1);
        try {
            TimeUnit.SECONDS.sleep(timeout);
            System.out.println(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
