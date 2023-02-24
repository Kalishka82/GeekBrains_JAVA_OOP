package web_04.Game.Defences;

import web_04.Game.Defence;

public class Goldenshell implements Defence {
    private String defenceName;
    private int armorPoint;
    private String defenceSize;

    public Goldenshell(String defenceName, int armorPoint, String defenceSize) {
        this.defenceName = defenceName;
        this.armorPoint = armorPoint;
        this.defenceSize = defenceSize;
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

    public String getDefenceSize() {
        return defenceSize;
    }

    public void setDefenceSize(String defenceSize) {
        this.defenceSize = defenceSize;
    }

    @Override
    public int armor() {
        return armorPoint;
    }

    @Override
    public String toString() {
        return "Goldenshell{" +
                "defenceName='" + defenceName + '\'' +
                ", armorPoint=" + armorPoint +
                ", defenceSize='" + defenceSize + '\'' +
                '}';
    }
}
