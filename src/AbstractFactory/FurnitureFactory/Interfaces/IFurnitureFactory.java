package AbstractFactory.FurnitureFactory.Interfaces;

import AbstractFactory.Products.Interfaces.IChair;
import AbstractFactory.Products.Interfaces.ICoffeTable;
import AbstractFactory.Products.Interfaces.ISofa;

public interface IFurnitureFactory {
    public IChair createChair();
    public ISofa createSofa();
    public ICoffeTable createCoffeTable();
}
