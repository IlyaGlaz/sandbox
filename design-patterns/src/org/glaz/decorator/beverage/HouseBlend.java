package org.glaz.decorator.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        description = "House Blend Coffee";
        price = 0.89;
        this.size = size;
    }

    @Override
    public double cost() {
        return price;
    }
}
