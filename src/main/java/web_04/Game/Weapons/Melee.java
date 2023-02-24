package web_04.Game.Weapons;

import web_04.Game.Weapon;

public class Melee implements Weapon {
    String weaponName;
    private int damagePoint;

    public Melee(String weaponName, int damagePoint) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return "Melee{" +
                "weaponName='" + weaponName + '\'' +
                ", damagePoint=" + damagePoint +
                '}';
    }
}
