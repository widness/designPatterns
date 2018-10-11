package lab.strategy.adventureGame;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "cutting with a knife";
    }
}
