package web_04.Game;

import web_04.Game.Defences.Goldenshell;
import web_04.Game.Weapons.Melee;

public class Footman extends BaseHero<Melee, Goldenshell> {
    public Footman(int health, String name, Melee weapon, Goldenshell defence) {
        super(health, name, weapon, defence);
    }

    public String size() {
        return defence.getDefenceSize();
    }

    @Override
    public String toString() {
        return String.format("Footman{} %s", super.toString());
    }
}
