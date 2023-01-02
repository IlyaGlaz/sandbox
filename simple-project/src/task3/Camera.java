package task3;

import java.util.function.Predicate;

public class Camera extends Electronics {
    String cameraName;

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void printSomething() {

    }

    public static void main(String[] args) {
        Camera s1 = null;
        String s2 = null;
        System.out.println(s1.hashCode());
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}
