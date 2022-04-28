package AbstractFactory.Products;

import AbstractFactory.Products.Interfaces.ISofa;

public class ModernSofa implements ISofa {
    public void hasLegs() {
        System.out.println("ModernSofa has legs");
    }

    public void sitOn() {
        System.out.println("ModernSofa sits on");
    }
}