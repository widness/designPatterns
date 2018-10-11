package lab.strategy.adventureGame;

public class Queen extends Character {
    KnifeBehavior knife = new KnifeBehavior();

    public Queen() { // Arme par defaut
        this.setWeaponBehavior(knife);
    }
}
