package org.glaz.decorator;

import org.glaz.decorator.beverage.Beverage;
import org.glaz.decorator.beverage.DarkRoast;
import org.glaz.decorator.beverage.HouseBlend;
import org.glaz.decorator.condiment.Mocha;
import org.glaz.decorator.condiment.Soy;
import org.glaz.decorator.condiment.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast(Beverage.Size.MIDDLE);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend(Beverage.Size.SMALL);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
    }
}
