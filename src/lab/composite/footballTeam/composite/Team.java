package lab.composite.footballTeam.composite;

import lab.composite.footballTeam.leaf.Playable;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 10
 *
 * @author egs
 */
public class Team implements Playable {

    public void add(Playable p) {
        myPlayers.add(p);
    }

    public void remove(Playable p) {
        myPlayers.remove(p);
    }

    @Override
    public void cry() {
        for (Playable p : myPlayers) {
            p.cry();
        }
    }

    @Override
    public void enterField() {
        for (Playable p : myPlayers) {
            p.enterField();
        }
    }

    @Override
    public void shoot() {
        for (Playable p : myPlayers) {
            p.shoot();
        }
    }

    @Override
    public void simulateInjury() {
        for (Playable p : myPlayers) {
            p.simulateInjury();
        }
    }

    private List<Playable> myPlayers = new ArrayList<Playable>();
}
