package web_04.Game.Weapons;

import web_04.Game.Weapon;

public class Ranged implements Weapon {
    private String WeaponName;
    private int damagePoint;
    private int range;

    public Ranged(String weaponName, int damagePoint, int range) {
        WeaponName = weaponName;
        this.damagePoint = damagePoint;
        this.range = range;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return "Ranged{" +
                "WeaponName='" + WeaponName + '\'' +
                ", damagePoint=" + damagePoint +
                ", range=" + range +
                '}';
    }
}
