package org.example.task1;

public class Runner {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new SimpleRunnable()).start();
        }
    }
}
