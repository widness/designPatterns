package lab.factory.building.house;


import ch.hevs.design_patterns.lab4_ex2.wall.BricksWall;
import ch.hevs.design_patterns.lab4_ex2.wall.Wall;

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
