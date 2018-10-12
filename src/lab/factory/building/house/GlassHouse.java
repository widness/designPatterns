package lab.factory.building.house;


import ch.hevs.design_patterns.lab4_ex2.wall.GlassWall;
import ch.hevs.design_patterns.lab4_ex2.wall.Wall;

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
