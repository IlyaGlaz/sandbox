package org.glaz.decorator.condiment;

import org.glaz.decorator.beverage.Beverage;

public class Whip extends Decorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        price = 0.10;
        size = beverage.getSize();
    }

    @Override
    public double cost() {
        return beverage.cost() + calculatePrice();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
