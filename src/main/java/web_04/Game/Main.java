/*
Урок 4. ООП: Обобщения. ч1
На основе работы на уроке.
Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors
обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.
Добавить метод определения минимального щита в команде.
* Продумать, как можно сделать воина без щита.
 */
package web_04.Game;

import web_04.Game.Defences.Goldenshell;
import web_04.Game.Defences.Tortoiseshell;
import web_04.Game.Weapons.Melee;
import web_04.Game.Weapons.Ranged;


public class Main {
    public static void main(String[] args) {
        Team<Footman> squadF = new Team<>();
        squadF.add(new Footman(55, "Joe"
                , new Melee("spear", 15)
                , new Goldenshell("shell1", 10, "large")));
        squadF.add(new Footman(55, "Moe"
                , new Melee("sword", 10)
                , new Goldenshell("shell2", 8, "middle")));
        squadF.add(new Footman(55, "Doe"
                , new Melee("axe", 20)
                , new Goldenshell("shell3", 6, "small")));


//        for (Footman item : squadF) {
//            System.out.println(item);
//        }

        System.out.printf(String.format("TeamHealth: %d\n",squadF.getTeamHealth()));
        System.out.printf(String.format("MaxRange: %d\n",squadF.getMaxRange()));
        System.out.printf(String.format("SumDamage: %d\n",squadF.getSumDamage()));
        System.out.printf(String.format("SumArmor: %d\n",squadF.getSumArmor()));
        System.out.println("MinArmorName: " + squadF.minArmor());
        System.out.println("------------------");

        Team<BaseHero> squadA = new Team<>();
        squadA.add(new Archer(15, "Jonh"
                , new Ranged("bow", 15, 50)
                , new Tortoiseshell("tshell1", 5)));
        squadA.add(new Archer(15, "Jonathan"
                , new Ranged("crossbow", 20, 25)
                , new Tortoiseshell("tshell1", 5)));
        squadA.add(new Footman(55, "Carl"
                , new Melee("sword", 20)
                , new Goldenshell("shell1", 10, "large")));
        squadA.add(new Footman(55, "Earl"
                , new Melee("axe", 20)
                , new Goldenshell("shell1", 6, "small")));


//        for (BaseHero item : squadA) {
//            System.out.println(item);
//        }

        System.out.printf(String.format("TeamHealth: %d\n",squadA.getTeamHealth()));
        System.out.printf(String.format("MaxRange: %d\n",squadA.getMaxRange()));
        System.out.printf(String.format("SumDamage: %d\n",squadA.getSumDamage()));
        System.out.printf(String.format("SumArmor: %d\n",squadA.getSumArmor()));
        System.out.println("MinArmor: " + squadA.minArmor());
        System.out.println("------------------");

        Footman footman1 = new Footman(77, "Marks"
                , new Melee("book", 30)
                , new Goldenshell("shell6", 10, "large"));
        Footman footman2 = new Footman(66, "Adam"
                , new Melee("weights", 45)
                , new Goldenshell("shell5", 8, "middle"));
        while (footman1.getHealth() > 0 && footman2.getHealth() > 0) {
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println("---");
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println("------");
        }
        if (footman1.getHealth() > 0) {
            System.out.println(footman1 + " is Winner");
        } else {
            System.out.println(footman2 + " is Winner");
        }
    }
}
