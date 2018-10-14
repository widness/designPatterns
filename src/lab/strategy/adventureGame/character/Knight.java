package lab.strategy.adventureGame.character;

import lab.strategy.adventureGame.weapon.SwordBehavior;

/**
 * Lab 1
 * @author scz
 */
public class Knight extends Character {
    
    public Knight() {
        System.out.println("[character.Knight]");
        this.setWeapon(new SwordBehavior());
    }
}
