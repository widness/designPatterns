package lab.strategy.adventureGame.character;

import lab.strategy.adventureGame.weapon.WeaponBehavior;

/**
 * Lab 1
 *
 * @author scz
 */
public abstract class Character {

    private WeaponBehavior weapon = null;

    public Character() {
    }

    public void fight() {
        if (this.weapon == null) {
            System.out.println("no weapon for this caracter");
        } else {
            this.weapon.useWeapon();
        }
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
