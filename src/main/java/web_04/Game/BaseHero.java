package web_04.Game;

import java.util.Random;

public abstract class BaseHero <W extends Weapon, D extends Defence> {
    private int health;
    private String name;
    protected W weapon;
    protected D defence;

    protected BaseHero(int health, String name, W weapon, D defence) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        this.defence = defence;
    }

    public int damageFork() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
    public boolean hit(BaseHero recepient) {
        int damage = damageFork();
        int armor = armorFork();
        return ! recepient.refundReduceHealth(armor, damage);
    }

    public int armorFork() {
        Random random = new Random();
        return random.nextInt(defence.armor());
    }

    public boolean refundReduceHealth(int armor, int damage) {
        health += armor;
        health -= damage;
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public D getDefence() {
        return defence;
    }

    public void setDefence(D defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "BaseHero{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                ", defence=" + defence +
                '}';
    }
}
