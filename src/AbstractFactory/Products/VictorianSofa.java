package AbstractFactory.Products;
import AbstractFactory.Products.Interfaces.ISofa;

public class VictorianSofa implements ISofa {
    public void hasLegs() {
        System.out.println("Victorian sofa has legs");
    }

    public void sitOn() {
        System.out.println("Victorian sofa is for sitting");
    }
}

