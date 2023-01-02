package task3;

public interface CanFly {
    public default void swim() {
        System.out.println("Swim");
    }
}
