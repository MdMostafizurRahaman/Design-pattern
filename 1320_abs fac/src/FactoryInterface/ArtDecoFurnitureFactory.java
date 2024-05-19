package FactoryInterface;

import ArtDeco.ArtDecoChair;
import ArtDeco.ArtDecoCoffeeTable;
import ArtDeco.ArtDecoSofa;
import Interface.Chair;
import Interface.CoffeeTable;
import Interface.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
