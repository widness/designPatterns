package lab.abstractFactory.building.wall;

import lab.abstractFactory.building.AbstractFactory;
import lab.abstractFactory.building.house.House;

public class WallFactory extends AbstractFactory {
    @Override
    protected House getHouse(String houseName) {
        return null;
    }

    @Override
    public Wall getWall(String wallName) {
        switch (wallName) {
            case "Bricks": {
                return new BricksWall();
            }
            case "Glass": {
                return new GlassWall();
            }
            case "Wood": {
                return new WoodWall();
            }
            default: {
                return null;
            }
        }
    }
}
