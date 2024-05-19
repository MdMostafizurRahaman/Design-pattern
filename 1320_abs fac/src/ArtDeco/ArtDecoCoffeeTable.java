package ArtDeco;

import Interface.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Putting coffee on an Art Deco coffee table");
    }
}