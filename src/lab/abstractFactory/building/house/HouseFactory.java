package lab.abstractFactory.building.house;

import lab.abstractFactory.building.AbstractFactory;
import lab.abstractFactory.building.wall.Wall;

public class HouseFactory extends AbstractFactory {

    @Override
    protected House getHouse(String houseName) {
        switch (houseName) {
            case "BRICKS": {
                return new BricksHouse();
            }
            case "GLASS": {
                return new GlassHouse();
            }
            case "WOOD": {
                return new WoodHouse();
            }
            default: {
                return null;
            }
        }
    }

    @Override
    protected Wall getWall(String wallName) {
        return null;
    }
}
