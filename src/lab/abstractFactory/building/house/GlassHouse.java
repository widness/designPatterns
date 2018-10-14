package lab.abstractFactory.building.house;


import lab.abstractFactory.building.wall.GlassWall;
import lab.abstractFactory.building.wall.Wall;

/**
 * Lab 4
 * @author egs
 */
public class GlassHouse extends House {
    
    public GlassHouse() {
        this.name = "Moder German house";
    }

    @Override
    protected Wall createWall() {
        return new GlassWall();
    }
    
}
