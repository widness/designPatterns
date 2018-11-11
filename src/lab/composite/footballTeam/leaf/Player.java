package lab.composite.footballTeam.leaf;

/**
 * Lab 10
 *
 * @author egs
 */
public class Player implements Playable {

    private int name;

    public Player(int name) {
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println(name + " is crying");
    }

    @Override
    public void enterField() {
        System.out.println(name + " is entering field");
    }

    @Override
    public void shoot() {
        System.out.println(name + " is shooting");
    }

    @Override
    public void simulateInjury() {
        System.out.println(name + " is simulating an Injury");
    }
}
