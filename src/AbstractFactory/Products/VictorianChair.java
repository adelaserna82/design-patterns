package AbstractFactory.Products;

import AbstractFactory.Products.Interfaces.IChair;

public class VictorianChair implements IChair {
    public void hasLegs() {
        System.out.println("Victorian chair  has 4 legs.");
    }

    public void sitOn() {
        System.out.println("Victorian chair is very comfortable to sit on.");
    }
}
