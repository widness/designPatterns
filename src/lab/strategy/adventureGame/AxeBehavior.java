package lab.strategy.adventureGame;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "Chopping with an axe";
    }
}
