package lab.strategy.adventureGame;

public class Character {

    WeaponBehavior weapon;
    public Character(){}

    public void performFight() {
        System.out.println(this.weapon.useWeapon());
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weapon = wb;
    }
}
