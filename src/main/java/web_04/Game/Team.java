package web_04.Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends BaseHero> implements Iterable<T> {
    List<T> dreamTeam = new ArrayList<>();

    public void add(T t) {
        dreamTeam.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return dreamTeam.iterator();
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (T hero : dreamTeam) {
            teamHealth += hero.getHealth();
        }
        return teamHealth;
    }

    public int getMaxRange() {
        int maxRange = 0;
        for (T hero : dreamTeam) {
            if (hero instanceof Archer) {
                Archer archer = (Archer) hero;
                if (maxRange < archer.range()) {
                    maxRange = archer.range();
                }
            }
        }
        return maxRange;
    }

    public int getSumDamage() {
        int sumDamage = 0;
        for (T hero : dreamTeam) {
            sumDamage += hero.weapon.damage();
        }
        return sumDamage;
    }

    public int getSumArmor() {
        int sumArmor = 0;
        for (T hero : dreamTeam) {
            sumArmor += hero.defence.armor();
        }
        return sumArmor;
    }

    public T minArmor() {
        T element = null;
        for (T hero : dreamTeam) {
            if (element == null) {
                element = hero;
            }
            BaseHero basehero = (BaseHero) hero;
            if (element.defence.armor() > hero.defence.armor()) {
                element = hero;
            }
        }
        return element;
    }
}
