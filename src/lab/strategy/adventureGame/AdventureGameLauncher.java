package lab.strategy.adventureGame;

import lab.strategy.adventureGame.character.*;
import lab.strategy.adventureGame.character.Character;
import lab.strategy.adventureGame.weapon.BowAndArrowBehavior;
import lab.strategy.adventureGame.weapon.KnifeBehavior;

/**
 * Lab 2
 * @author scz
 */
public class AdventureGameLauncher {

    public AdventureGameLauncher() {
    }
    
    public static void main(String[] args) {
        AdventureGameLauncher launcher = new AdventureGameLauncher();
        launcher.test();
    }
    
    public void test() {
        Character king1 = new King();
        king1.fight();
        
        Character king2 = new King();
        king2.setWeapon(new BowAndArrowBehavior());
        king2.fight();
        king2.setWeapon(new KnifeBehavior());
        king2.fight();

        Character queen = new Queen();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();
        
        Character troll = new Troll();
        troll.fight();
        
        Character knight = new Knight();
        knight.fight();
    }
}
