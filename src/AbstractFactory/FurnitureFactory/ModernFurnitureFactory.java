package AbstractFactory.FurnitureFactory;

import AbstractFactory.Products.Interfaces.IChair;
import AbstractFactory.Products.Interfaces.ICoffeTable;
import AbstractFactory.FurnitureFactory.Interfaces.IFurnitureFactory;
import AbstractFactory.Products.Interfaces.ISofa;
import AbstractFactory.Products.ModernChair;
import AbstractFactory.Products.ModernCoffeTable;
import AbstractFactory.Products.ModernSofa;

public class ModernFurnitureFactory implements IFurnitureFactory {
    public IChair createChair() {
        return new ModernChair();
    }

    public ISofa createSofa() {
        return new ModernSofa();
    }

    public ICoffeTable createCoffeTable() {
        return new ModernCoffeTable();
    }
}