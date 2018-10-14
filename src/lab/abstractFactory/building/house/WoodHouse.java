package lab.abstractFactory.building.house;

import lab.abstractFactory.building.wall.Wall;
import lab.abstractFactory.building.wall.WoodWall;

/**
 * Lab 4
 * @author egs
 */
public class WoodHouse extends House {
    
    public WoodHouse() {
        this.name = "Swiss wood chalet";
    }

    @Override
    protected Wall createWall() {
        return new WoodWall();
    }
    
}
