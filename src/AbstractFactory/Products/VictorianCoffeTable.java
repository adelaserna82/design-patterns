package AbstractFactory.Products;

import  AbstractFactory.Products.Interfaces.ICoffeTable;

public class VictorianCoffeTable implements ICoffeTable {
    public void hasLegs() {
        System.out.println("Victorian coffe table has legs");
    }

    public void adjustHeigth() {
        System.out.println("Victorian coffe table is adjusted to a height of 100 cm");
    }
}

