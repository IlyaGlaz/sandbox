package task4;

public class Test extends Thread {

    public Test() {
        System.out.print("MyThread");
    }

    public void run() {
        System.out.println(" bar");
    }

    public void run(String s) {
        System.out.println(" baz");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Test() {
            public void run() {
                System.out.println(" foo");
            }
        };
        t.start();
    }
}
