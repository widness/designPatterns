package lab.strategy.adventureGame;

public class Main {
    public static void main(String[] args) {
        Queen maria = new Queen();
        King lord = new King();

        KnifeBehavior knife = new KnifeBehavior(); // Arme pendant le runtime
        AxeBehavior axe = new AxeBehavior();

        maria.setWeaponBehavior(knife);
        lord.setWeaponBehavior(axe);

        maria.performFight();
        lord.performFight();
    }
}
