package FactoryInterface;

import Interface.Chair;
import Interface.CoffeeTable;
import Interface.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}