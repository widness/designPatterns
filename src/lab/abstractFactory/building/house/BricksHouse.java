package lab.abstractFactory.building.house;

import lab.abstractFactory.building.wall.BricksWall;
import lab.abstractFactory.building.wall.Wall;

/**
 * Lab 4
 * @author egs
 */
public class BricksHouse extends House {
    
    public BricksHouse() {
        this.name = "Typical dutch house";
    }

    @Override
    protected Wall createWall() {
        return new BricksWall();
    }

}
