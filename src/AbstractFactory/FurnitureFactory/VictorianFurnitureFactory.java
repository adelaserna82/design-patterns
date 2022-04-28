package AbstractFactory.FurnitureFactory;


import AbstractFactory.Products.Interfaces.IChair;
import AbstractFactory.Products.Interfaces.ICoffeTable;
import AbstractFactory.FurnitureFactory.Interfaces.IFurnitureFactory;
import AbstractFactory.Products.Interfaces.ISofa;
import AbstractFactory.Products.VictorianChair;
import AbstractFactory.Products.VictorianCoffeTable;
import AbstractFactory.Products.VictorianSofa;

public class VictorianFurnitureFactory implements IFurnitureFactory {
    public IChair createChair() {
        return new VictorianChair();
    }

    public ISofa createSofa() {
        return new VictorianSofa();
    }

    public ICoffeTable createCoffeTable() {
        return new VictorianCoffeTable();
    }
}