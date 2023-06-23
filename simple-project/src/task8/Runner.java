package task8;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while(true) {
            Thread.sleep(1000);
            System.out.println(i++);
        }
    }
}
