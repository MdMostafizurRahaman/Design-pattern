package FactoryInterface;

import Interface.Chair;
import Interface.CoffeeTable;
import Interface.Sofa;
import Victorian.VictorianSofa;
import Victorian.VictorianChair;
import Victorian.VictorianCoffeeTable;




public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
