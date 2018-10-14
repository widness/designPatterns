package lab.abstractFactory.building;


import lab.abstractFactory.building.house.BricksHouse;
import lab.abstractFactory.building.house.GlassHouse;
import lab.abstractFactory.building.house.House;
import lab.abstractFactory.building.house.WoodHouse;

/**
 * Lab 4
 * @author egs
 */
public class ArchitectOffice {
    
    public static void main(String[] args) {

        AbstractFactory houseFactory = FactoryProducer.getFactory("HOUS");
        House house1 = houseFactory.getHouse("GLASS");

        house1.buildHouse();
        house1.calculatePrice();

        House house2 = houseFactory.getHouse("BRICKS");
        house2.buildHouse();
        house2.calculatePrice();

        House house3 = houseFactory.getHouse("WOOD");
        house3.buildHouse();
        house3.calculatePrice();

    }
}
