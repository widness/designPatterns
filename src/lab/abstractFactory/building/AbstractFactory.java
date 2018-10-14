package lab.abstractFactory.building;

import lab.abstractFactory.building.house.House;
import lab.abstractFactory.building.wall.Wall;

public abstract class AbstractFactory {
    protected abstract House getHouse(String houseName);
    protected abstract Wall getWall(String wallName);
}
