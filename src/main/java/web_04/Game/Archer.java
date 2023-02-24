package web_04.Game;

import web_04.Game.Defences.Tortoiseshell;
import web_04.Game.Weapons.Ranged;

public class Archer extends BaseHero<Ranged, Tortoiseshell> {

//    public Archer(int health, String name, Ranged weapon) {
//        super(health, name, weapon);
//    }
    public Archer(int health, String name, Ranged weapon, Tortoiseshell defence) {
        super(health, name, weapon, defence);
    }

    public int range() {
//        return ((Ranged)weapon).getRange();
        return weapon.getRange();
    }

    @Override
    public String toString() {
        return String.format("Archer{} %s", super.toString());
    }
}
