package org.example.task1;

public class SimpleRunnable implements Runnable {

    private int count;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public SimpleRunnable() {
        System.out.println("In constructor of " + "Task #" + id);
    }

    @Override
    public void run() {
        while (count++ < 3) {
            System.out.println(count + " time " + " in method 'run' of Task #" + id);
            Thread.yield();
        }
        System.out.println("Task # " + id + " is finished");
    }
}
