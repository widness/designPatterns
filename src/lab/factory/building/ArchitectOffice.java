package lab.factory.building;


import lab.factory.building.house.BricksHouse;
import lab.factory.building.house.GlassHouse;
import lab.factory.building.house.House;
import lab.factory.building.house.WoodHouse;

/**
 * Lab 4
 * @author egs
 */
public class ArchitectOffice {
    
    public static void main(String[] args) {
        House house1 = new GlassHouse();
        house1.buildHouse();
        house1.calculatePrice();

        House house2 = new BricksHouse();
        house2.buildHouse();
        house2.calculatePrice();

        House house3 = new WoodHouse();
        house3.buildHouse();
        house3.calculatePrice();

    }
}
