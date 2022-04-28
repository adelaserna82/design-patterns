package AbstractFactory;

import AbstractFactory.FurnitureFactory.VictorianFurnitureFactory;
import AbstractFactory.FurnitureFactory.ModernFurnitureFactory;
import AbstractFactory.FurnitureFactory.Interfaces.IFurnitureFactory;
import AbstractFactory.Products.Interfaces.IChair;
import AbstractFactory.Products.Interfaces.ICoffeTable;
import AbstractFactory.Products.Interfaces.ISofa;

public class Client {


    public static void main(String[] args) {
        // One client can create a sofa with any concrete factory
        String factoryName = "Victorian";
        IFurnitureFactory factory = null;
        if (factoryName.equals(factoryName)){
            factory = new VictorianFurnitureFactory();
        } else {
            factory = new ModernFurnitureFactory();
        }
        showFurniture(factory);
    }

    public static void showFurniture(IFurnitureFactory factory){

        IChair chair = factory.createChair();
        ISofa sofa = factory.createSofa();
        ICoffeTable table = factory.createCoffeTable();
        chair.hasLegs();
        sofa.sitOn();
        table.hasLegs();
    }
}
