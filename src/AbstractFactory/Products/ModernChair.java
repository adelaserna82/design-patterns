package AbstractFactory.Products;

import AbstractFactory.Products.Interfaces.IChair;

public class ModernChair implements IChair {
    public void hasLegs() {
        System.out.println("Modern chair has 4 legs.");
    }

    public void sitOn() {
        System.out.println("Modern chair is very comfortable to sit on.");
    }
}
