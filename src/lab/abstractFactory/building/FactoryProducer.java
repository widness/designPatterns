package lab.abstractFactory.building;

import lab.abstractFactory.building.house.HouseFactory;
import lab.abstractFactory.building.wall.WallFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("HOUSE")){
            return new HouseFactory();
        } else if(choice.equalsIgnoreCase("WALL")) {
            return new WallFactory();
        }
        return null;
    }
}
