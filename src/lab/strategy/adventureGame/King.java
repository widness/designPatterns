package lab.strategy.adventureGame;

public class King extends Character {
    AxeBehavior Axe = new AxeBehavior();

    public King() { // Arme par defaut
        this.setWeaponBehavior(Axe);
    }
}
