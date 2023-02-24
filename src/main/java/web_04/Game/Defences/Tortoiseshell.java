package web_04.Game.Defences;

import web_04.Game.Defence;

public class Tortoiseshell implements Defence {
    private String defenceName;
    private int armorPoint;

    public Tortoiseshell(String defenceName, int armorPoint) {
        this.defenceName = defenceName;
        this.armorPoint = armorPoint;
    }

    public String getDefenceName() {
        return defenceName;
    }

    public void setDefenceName(String defenceName) {
        this.defenceName = defenceName;
    }

    public int getArmorPoint() {
        return armorPoint;
    }

    public void setArmorPoint(int armorPoint) {
        this.armorPoint = armorPoint;
    }

    @Override
    public int armor() {
        return armorPoint;
    }

    @Override
    public String toString() {
        return "Tortoiseshell{" +
                "defenceName='" + defenceName + '\'' +
                ", armorPoint=" + armorPoint +
                '}';
    }
}
