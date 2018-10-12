package lab.factory.building.house;


import ch.hevs.design_patterns.lab4_ex2.wall.Wall;
import ch.hevs.design_patterns.lab4_ex2.wall.WoodWall;

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
