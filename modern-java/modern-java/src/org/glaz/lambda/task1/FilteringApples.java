package org.glaz.lambda.task1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FilteringApples {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );

        prettyPrintApple(inventory, FilteringApples::printWeightOfApples);

        prettyPrintApple(inventory, FilteringApples::printAppleIsLightOrHeavy);
    }

    public static void prettyPrintApple(List<Apple> inventory, Function<Apple, String> function) {
        for (Apple apple : inventory) {
            String output = function.apply(apple);
            System.out.println(output);
        }
    }

    public static String printWeightOfApples(Apple apple) {
        return String.format("Apple{weight=%d}", apple.getWeight());
    }

    public static String printAppleIsLightOrHeavy (Apple apple) {
        return apple.getWeight() < 150 ? apple + " is light"
                : apple + " is heavy";
    }
}
