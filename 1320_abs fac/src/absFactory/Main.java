package absFactory;


import FactoryInterface.ArtDecoFurnitureFactory;
import FactoryInterface.FurnitureFactory;
import FactoryInterface.VictorianFurnitureFactory;
import Interface.Chair;
import Interface.CoffeeTable;
import Interface.Sofa;
import Modern.ModernFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ArtDecoFurnitureFactory(); 

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putCoffee();
    }
}
