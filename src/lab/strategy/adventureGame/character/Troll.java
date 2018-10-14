package lab.strategy.adventureGame.character;

import lab.strategy.adventureGame.weapon.AxeBehavior;

/**
 * Lab 1
 * @author scz
 */
public class Troll extends Character {
    
    public Troll() {
        System.out.println("[character.Troll]");
        this.setWeapon(new AxeBehavior());
    }
}
