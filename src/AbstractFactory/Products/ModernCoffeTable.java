package AbstractFactory.Products;

import AbstractFactory.Products.Interfaces.ICoffeTable;

public class ModernCoffeTable implements ICoffeTable {
    public void hasLegs() {
        System.out.println("ModernCoffeTable has legs");
    }

    public void adjustHeigth() {
        System.out.println("ModernCoffeTable adjust heigth");
    }
}
